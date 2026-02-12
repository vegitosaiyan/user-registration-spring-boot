package com.example.userregistration.mapper;

import com.example.userregistration.dto.UserDto.UserRequest;
import com.example.userregistration.dto.UserDto.UserResponse;
import com.example.userregistration.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface UserMapper {
     User toEntity(UserRequest request);
     UserResponse toResponse(User user);
}