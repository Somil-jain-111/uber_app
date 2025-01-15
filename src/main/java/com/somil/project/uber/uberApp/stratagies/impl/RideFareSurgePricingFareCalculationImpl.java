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

public class RideFareSurgePricingFareCalculationImpl implements RideFareCalculationStratagy {
    private final DistanceService distanceService;
    private  static  final double SURGE_FACTOR=2;
    @Override
    public double fareCalculation(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),rideRequest.getDropOffLocation());
        return distance * RIDE_FARE_MULTIPLIER * SURGE_FACTOR;
    }
}
