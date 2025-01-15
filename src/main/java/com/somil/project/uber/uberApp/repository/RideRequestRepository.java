package com.somil.project.uber.uberApp.repository;

import com.somil.project.uber.uberApp.entity.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
}
