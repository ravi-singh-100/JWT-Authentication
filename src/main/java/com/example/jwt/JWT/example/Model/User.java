package com.example.jwt.JWT.example.Model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
    private String userId;
    private String name;
    private String email;
}
