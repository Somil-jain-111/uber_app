package com.somil.project.uber.uberApp.stratagies;

import com.somil.project.uber.uberApp.DTO.RideRequestDTO;
import com.somil.project.uber.uberApp.entity.Driver;
import com.somil.project.uber.uberApp.entity.RideRequest;

import java.util.List;

public interface DriverMactingStratagy {
    List<Driver> findMatchingDrivers(RideRequest rideRequest);
}
