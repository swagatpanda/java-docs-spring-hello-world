package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsernameToken{
    @JsonProperty("Username") 
    public String username;
    @JsonProperty("Password") 
    public String password;
}