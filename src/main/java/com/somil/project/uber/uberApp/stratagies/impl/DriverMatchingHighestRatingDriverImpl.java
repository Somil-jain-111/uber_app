package com.somil.project.uber.uberApp.stratagies.impl;

import com.somil.project.uber.uberApp.DTO.RideRequestDTO;
import com.somil.project.uber.uberApp.entity.Driver;
import com.somil.project.uber.uberApp.entity.RideRequest;
import com.somil.project.uber.uberApp.repository.DriverRepository;
import com.somil.project.uber.uberApp.stratagies.DriverMactingStratagy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service

public class DriverMatchingHighestRatingDriverImpl implements DriverMactingStratagy {
    private final DriverRepository driverRepository;
    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        System.out.println("ssssssssssssssss");
        System.out.println(rideRequest.getPickupLocation());
        return driverRepository.findTenNearByTopRatedDriver(rideRequest.getPickupLocation());
    }
}
