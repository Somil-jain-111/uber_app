package com.somil.project.uber.uberApp.service.impl;

import com.somil.project.uber.uberApp.DTO.DriverDTO;
import com.somil.project.uber.uberApp.DTO.SignUpDTO;
import com.somil.project.uber.uberApp.DTO.UserDTO;
import com.somil.project.uber.uberApp.entity.Rider;
import com.somil.project.uber.uberApp.entity.User;
import com.somil.project.uber.uberApp.entity.enums.UserRoles;
import com.somil.project.uber.uberApp.exception.RuntimeConflictException;
import com.somil.project.uber.uberApp.repository.RiderRepository;
import com.somil.project.uber.uberApp.repository.UserRepository;
import com.somil.project.uber.uberApp.service.AuthService;
import com.somil.project.uber.uberApp.service.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final ModelMapper modelMapper;
    private  final UserRepository userRepository;
    private  final RiderRepository riderRepository;
    private  final RiderService riderService;

    @Override
    public String login(String email, String password) {
            return "";
    }

    @Override
    @Transactional
    public UserDTO signup(SignUpDTO signUpDTO) {
         userRepository.findByEmail(signUpDTO.getEmail()).ifPresent(user->{
            throw new RuntimeConflictException("Cannot signup, User Already exists in our system with this email " + signUpDTO.getEmail());
         });
//        if(IsuserExist != null){
//            throw  ;
//        }
        User user = modelMapper.map(signUpDTO, User.class);

        user.setRoles(Set.of(UserRoles.RIDER));
        User savedUser = userRepository.save(user);
         riderService.createNewRider(savedUser);
        return modelMapper.map(savedUser, UserDTO.class);
    }

    @Override
    public DriverDTO onBoardNewDriver(Long userId) {
        return null;
    }
}
