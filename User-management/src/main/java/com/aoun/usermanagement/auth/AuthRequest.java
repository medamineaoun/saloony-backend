package com.aoun.usermanagement.auth;

import lombok.Data;

@Data
public class AuthRequest {
    private String userEmail;
    private String userPassword;
}