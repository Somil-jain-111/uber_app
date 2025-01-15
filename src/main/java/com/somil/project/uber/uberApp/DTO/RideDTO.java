package com.somil.project.uber.uberApp.DTO;

import com.somil.project.uber.uberApp.entity.Driver;
import com.somil.project.uber.uberApp.entity.Rider;
import com.somil.project.uber.uberApp.entity.enums.PaymentMethods;
import com.somil.project.uber.uberApp.entity.enums.RideStatus;
import com.somil.project.uber.uberApp.entity.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDTO {

    private Long id;

    private Point pickupLocation;


    private  Point dropOffLocation;

    private RideRequestStatus status;

    private RiderDTO riderDTO;

    private Driver driver;

    private PaymentMethods paymentMethod;

    private RideStatus rideStatus;

    private  double fare;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String otp;

}
