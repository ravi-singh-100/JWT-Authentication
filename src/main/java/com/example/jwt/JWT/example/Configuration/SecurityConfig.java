package com.example.jwt.JWT.example.Configuration;

import com.example.jwt.JWT.example.Security.JWTAuthenticationEntryPoint;
import com.example.jwt.JWT.example.Security.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig {
    @Autowired
    private JWTAuthenticationEntryPoint point;
    @Autowired
    private JwtAuthenticationFilter filter;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(csrf -> csrf.disable()).cors(cors -> cors.disable()).authorizeHttpRequests(autocongig ->
                        autocongig.requestMatchers("/home/**").authenticated().requestMatchers("/auth/login").permitAll()
                                .anyRequest().authenticated()
                ).exceptionHandling(ex->ex.authenticationEntryPoint(point))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        httpSecurity.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return httpSecurity.build();
    }
}
