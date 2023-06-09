package com.example.its.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

@Configuration
public class PasswordEncoderConfig {
    
    @Bean //メソッドの戻り値のインスタンスがBean登録される
    public PasswordEncoder passwordEncoder(){
        return new Pbkdf2PasswordEncoder();
    }
}
