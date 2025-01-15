package com.somil.project.uber.uberApp.DTO;

import com.somil.project.uber.uberApp.entity.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class RiderDTO {


    private UserDTO user;
    private double rating;


}
