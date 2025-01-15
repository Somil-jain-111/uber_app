package com.somil.project.uber.uberApp.entity;

import com.somil.project.uber.uberApp.entity.enums.PaymentMethods;
import com.somil.project.uber.uberApp.entity.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PaymentMethods paymentMethods;

    @OneToOne(fetch = FetchType.LAZY)
    private  Ride ride;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private  Double amount;

    @CreationTimestamp
    private LocalDateTime paymentTime;


}
