package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Security{
    @JsonProperty("UsernameToken") 
    public UsernameToken usernameToken;
}