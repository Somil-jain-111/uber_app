package com.somil.project.uber.uberApp.service;

import com.somil.project.uber.uberApp.DTO.DriverDTO;
import com.somil.project.uber.uberApp.DTO.RideDTO;
import com.somil.project.uber.uberApp.DTO.RiderDTO;

import  java.util.List;

public interface DriverService {


    RideDTO acceptRide(Long RideId);

    RideDTO cancelRide(Long RideId);

    RideDTO startRide(Long RideId);


    RideDTO endRide(Long RideId);

    RiderDTO rateRider(Long RideId, double rating);

    DriverDTO getMyProfile ();

    List<RideDTO> getAllMyRide ();

}
