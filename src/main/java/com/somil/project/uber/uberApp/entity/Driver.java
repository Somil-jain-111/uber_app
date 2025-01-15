package com.somil.project.uber.uberApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.locationtech.jts.geom.Point;

@Entity
@Table(name = "driver")
@Data
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private  User user;

    private  double rating;

    private  Boolean available;

    @Column(columnDefinition = "Geometry(Point,4326)")
 private   Point currentLocation;
}
