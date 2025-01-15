package com.somil.project.uber.uberApp.repository;

import com.somil.project.uber.uberApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
   Optional<User>  findByEmail(String email);
}
