package com.somil.project.uber.uberApp.entity;

import com.somil.project.uber.uberApp.entity.enums.PaymentMethods;
import com.somil.project.uber.uberApp.entity.enums.RideStatus;
import com.somil.project.uber.uberApp.entity.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Data
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "geometry(Point,4326)")
    private Point pickupLocation;


    @Column(columnDefinition = "geometry(Point,4326)")
    private  Point dropOffLocation;

    @CreationTimestamp
    private RideRequestStatus createdTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private  Rider rider;

    @ManyToOne(fetch = FetchType.LAZY)
    private  Driver driver;

    @Enumerated(EnumType.STRING)
    private PaymentMethods paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private  double fare;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String otp;
}
