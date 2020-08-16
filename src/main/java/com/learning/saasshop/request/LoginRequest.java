package com.learning.saasshop.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String phoneNumber;
    private String passWord;
    private Long pid;
}
