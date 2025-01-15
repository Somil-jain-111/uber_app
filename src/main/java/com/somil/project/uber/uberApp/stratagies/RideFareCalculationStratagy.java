package com.somil.project.uber.uberApp.stratagies;

import com.somil.project.uber.uberApp.DTO.RideRequestDTO;
import com.somil.project.uber.uberApp.entity.RideRequest;

public interface RideFareCalculationStratagy {

     double RIDE_FARE_MULTIPLIER= 10;

    double fareCalculation(RideRequest rideRequest);

}
