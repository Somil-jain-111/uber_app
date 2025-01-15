package com.somil.project.uber.uberApp.entity;

import com.somil.project.uber.uberApp.entity.enums.TransactionMethod;
import com.somil.project.uber.uberApp.entity.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class WalletTransaction {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private  Wallet wallet;

    private  Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionTypes;

    @Enumerated(EnumType.STRING)
    private TransactionMethod transactionMethod;

    @OneToOne(fetch =FetchType.LAZY)
    private  Ride ride;

    private String transactionId;

    @CreationTimestamp
    private LocalDateTime timeStamp;

}
