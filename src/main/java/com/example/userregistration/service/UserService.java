package com.example.userregistration.service;

import com.example.userregistration.dto.UserDto.UserRequest;
import com.example.userregistration.dto.UserDto.UserResponse;
import com.example.userregistration.entity.User;
import com.example.userregistration.mapper.UserMapper;
import com.example.userregistration.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Transactional
    public UserResponse registerUser(UserRequest request){

        User user = userMapper.toEntity(request);
        User savedUser = userRepository.save(user);

        log.info("User saved with id={}", savedUser.getId());
        return userMapper.toResponse(savedUser);
    }
}