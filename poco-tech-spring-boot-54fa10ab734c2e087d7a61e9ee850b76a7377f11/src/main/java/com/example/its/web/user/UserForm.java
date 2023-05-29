package com.example.its.web.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.its.web.validation.UniqueUsername;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserForm {
    
    @NotBlank
    @UniqueUsername
    private String username;

    @NotBlank
    @Size(min = 8, max = 128)
    private String password;



}
