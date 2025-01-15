package com.somil.project.uber.uberApp.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {

    private UserDTO userDTO;
    private double rating;

}
