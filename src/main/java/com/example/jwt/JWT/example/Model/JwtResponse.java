package com.example.jwt.JWT.example.Model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse {
    private String JwtToken;
    private String email;
}
