package com.somil.project.uber.uberApp.stratagies.impl;

import com.somil.project.uber.uberApp.DTO.RideRequestDTO;
import com.somil.project.uber.uberApp.entity.RideRequest;
import com.somil.project.uber.uberApp.service.DistanceService;
import com.somil.project.uber.uberApp.stratagies.RideFareCalculationStratagy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Primary
public class RideFareCalculationImpl implements RideFareCalculationStratagy {

    private final DistanceService distanceService;
    @Override
    public double fareCalculation(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),rideRequest.getDropOffLocation());
        System.out.println("distancedistancedistance");
        System.out.println(distance);
        return distance * RIDE_FARE_MULTIPLIER;
    }
}
