package com.somil.project.uber.uberApp.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SignUpDTO {

    private String name;
    private  String email;
    private String password;

}

