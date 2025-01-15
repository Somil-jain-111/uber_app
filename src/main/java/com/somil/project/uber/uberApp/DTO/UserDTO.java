package com.somil.project.uber.uberApp.DTO;


import com.somil.project.uber.uberApp.entity.enums.UserRoles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String name,email;
    private Set<UserRoles> userRoles;
}
