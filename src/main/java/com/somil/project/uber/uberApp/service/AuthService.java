package com.somil.project.uber.uberApp.service;

import com.somil.project.uber.uberApp.DTO.DriverDTO;
import com.somil.project.uber.uberApp.DTO.SignUpDTO;
import com.somil.project.uber.uberApp.DTO.UserDTO;

public interface AuthService {

    String login(String email,String password);

    UserDTO signup(SignUpDTO signUpDTO);

    DriverDTO onBoardNewDriver(Long userId);


}
