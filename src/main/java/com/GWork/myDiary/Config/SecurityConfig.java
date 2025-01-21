package com.GWork.myDiary.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF for testing purposes
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/signup").permitAll() // Allow access to /auth/signup for user creation
                        .requestMatchers("/entries").permitAll() // Allow access to /entries for both POST and GET
                        .anyRequest().authenticated() // Require authentication for all other requests
                );

        return http.build();
    }
}
