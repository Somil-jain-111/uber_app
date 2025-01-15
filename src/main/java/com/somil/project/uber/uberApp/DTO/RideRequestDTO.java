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

public class RideRequestDTO {
    private Long id;

    private PointDTO pickupLocation;
    private PointDTO dropOffLocation;
    private PaymentMethods paymentMethod;

    private LocalDateTime requestedTime;

    private RiderDTO rider;

    private RideRequestStatus rideRequestStatus;
}
