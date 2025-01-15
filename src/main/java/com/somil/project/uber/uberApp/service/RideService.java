package com.somil.project.uber.uberApp.service;



import com.somil.project.uber.uberApp.DTO.RideRequestDTO;
import com.somil.project.uber.uberApp.entity.Driver;
import com.somil.project.uber.uberApp.entity.Ride;
import com.somil.project.uber.uberApp.entity.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDriver (RideRequestDTO rideRequestDTO);


    Ride createNewRide (RideRequestDTO rideRequestDTO, Driver driver);

    Ride updateRideStatus (Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long RiderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long DriverId, PageRequest pageRequest);



}
