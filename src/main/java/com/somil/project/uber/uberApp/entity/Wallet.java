package com.somil.project.uber.uberApp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "user_wallet")
@Data
public class Wallet {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private  User user;

    private  double balance;

@OneToMany (mappedBy = "wallet",fetch = FetchType.LAZY)
    private List<WalletTransaction> transactions;

}
