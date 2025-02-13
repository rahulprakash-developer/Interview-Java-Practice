package com.javatechie.jwt.api.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AuthRequest {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
