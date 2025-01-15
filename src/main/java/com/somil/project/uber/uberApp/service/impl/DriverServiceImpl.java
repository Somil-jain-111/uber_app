package com.somil.project.uber.uberApp.service.impl;

import com.somil.project.uber.uberApp.DTO.DriverDTO;
import com.somil.project.uber.uberApp.DTO.RideDTO;
import com.somil.project.uber.uberApp.DTO.RiderDTO;
import com.somil.project.uber.uberApp.service.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDTO acceptRide(Long RideId) {
        return null;
    }

    @Override
    public RideDTO cancelRide(Long RideId) {
        return null;
    }

    @Override
    public RideDTO startRide(Long RideId) {
        return null;
    }

    @Override
    public RideDTO endRide(Long RideId) {
        return null;
    }

    @Override
    public RiderDTO rateRider(Long RideId, double rating) {
        return null;
    }

    @Override
    public DriverDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRide() {
        return List.of();
    }
}
