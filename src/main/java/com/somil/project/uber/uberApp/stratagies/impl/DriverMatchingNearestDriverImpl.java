package com.somil.project.uber.uberApp.stratagies.impl;

import com.somil.project.uber.uberApp.DTO.RideRequestDTO;
import com.somil.project.uber.uberApp.entity.Driver;
import com.somil.project.uber.uberApp.entity.RideRequest;
import com.somil.project.uber.uberApp.repository.DriverRepository;
import com.somil.project.uber.uberApp.stratagies.DriverMactingStratagy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Primary
public class DriverMatchingNearestDriverImpl implements DriverMactingStratagy {
    private  final DriverRepository driverRepository;
    @Override
    public List<Driver> findMatchingDrivers(RideRequest rideRequest) {
        System.out.println("rideRequestrideRequest");
        System.out.println(rideRequest);
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
