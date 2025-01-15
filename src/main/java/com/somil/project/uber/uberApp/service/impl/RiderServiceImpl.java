package com.somil.project.uber.uberApp.service.impl;

import com.somil.project.uber.uberApp.DTO.*;
import com.somil.project.uber.uberApp.entity.RideRequest;
import com.somil.project.uber.uberApp.entity.Rider;
import com.somil.project.uber.uberApp.entity.User;
import com.somil.project.uber.uberApp.entity.enums.RideRequestStatus;
import com.somil.project.uber.uberApp.exception.ResourceNotFoundException;
import com.somil.project.uber.uberApp.repository.RideRequestRepository;
import com.somil.project.uber.uberApp.repository.RiderRepository;
import com.somil.project.uber.uberApp.service.RiderService;
import com.somil.project.uber.uberApp.stratagies.DriverMactingStratagy;
import com.somil.project.uber.uberApp.stratagies.RideFareCalculationStratagy;
import com.somil.project.uber.uberApp.stratagies.StrategyManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareCalculationStratagy rideFareCalculationStratagy;
    private final DriverMactingStratagy driverMactingStratagy;
    private  final StrategyManager strategyManager;
    private  final RideRequestRepository rideRequestRepository;
    private final RiderRepository riderRepository;

    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        Rider rider = getCurrentRider();
        RideRequest rideRequest = modelMapper.map(rideRequestDTO, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare = strategyManager.rideFareCalculationStratagy().fareCalculation(rideRequest);
        rideRequest.setFare(fare);
        System.out.println("rideRequest");
        System.out.println(rideRequest.getPickupLocation());
            RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);
        System.out.println("ssssss");
        strategyManager.driverMactingStratagy(rider.getRating()).findMatchingDrivers(rideRequest);

        return modelMapper.map(savedRideRequest, RideRequestDTO.class);
    }

    @Override
    public RideDTO cancelRide(Long RideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(Long RideId, double rating) {
        return null;
    }

    @Override
    public RiderDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRide() {
        return List.of();
    }

    @Override
    public Rider createNewRider(User user) {
        Rider rider = Rider.
                builder()
                .user(user)
                .rating(0.0)
                .build();
        return riderRepository.save(rider);
    }

    @Override
    public Rider getCurrentRider() {
        return riderRepository.findById(1L).orElseThrow(()->
                 new ResourceNotFoundException("Rider not found with id: " + 1));
    }
}
