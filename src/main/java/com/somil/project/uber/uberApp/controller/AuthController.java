package com.somil.project.uber.uberApp.controller;


import com.somil.project.uber.uberApp.DTO.SignUpDTO;
import com.somil.project.uber.uberApp.DTO.UserDTO;
import com.somil.project.uber.uberApp.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping(path = "signup")
    UserDTO signup(@RequestBody SignUpDTO signUpDTO){
        return  authService.signup(signUpDTO);
    }
}
