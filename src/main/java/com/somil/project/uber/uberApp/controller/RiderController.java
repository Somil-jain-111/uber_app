package com.somil.project.uber.uberApp.controller;


import com.somil.project.uber.uberApp.DTO.RideRequestDTO;
import com.somil.project.uber.uberApp.service.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RiderController {


    private  final RiderService riderService;



    @PostMapping("/requestRide")
    public ResponseEntity<RideRequestDTO> requestRide (@RequestBody RideRequestDTO rideRequestDTO){

        return ResponseEntity.ok(riderService.requestRide(rideRequestDTO));
    }
}
