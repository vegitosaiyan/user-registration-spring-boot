package com.example.userregistration.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserDto {


    public record UserRequest(
            @NotBlank(message="Name must be present")
            String name,
            @NotNull(message="Age must be present")
            @Min(value = 1, message = "Age must be at least 1")
            Integer age,
            @NotBlank(message="Company name must be present")
            String companyName
    ){}

    public record UserResponse(Long id,String name, Integer age,
                               String companyName){}

}