package com.somil.project.uber.uberApp.service;

import com.somil.project.uber.uberApp.DTO.DriverDTO;
import com.somil.project.uber.uberApp.DTO.RideDTO;
import com.somil.project.uber.uberApp.DTO.RideRequestDTO;
import com.somil.project.uber.uberApp.DTO.RiderDTO;
import com.somil.project.uber.uberApp.entity.Rider;
import com.somil.project.uber.uberApp.entity.User;

import java.util.List;

public interface RiderService {


    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);

    RideDTO cancelRide(Long RideId);

    DriverDTO rateDriver(Long RideId, double rating);

    RiderDTO getMyProfile ();

    List<RideDTO> getAllMyRide ();

    Rider createNewRider (User user);

    Rider getCurrentRider();
}
