package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckUserRegistrationStatusResponse{
    @JsonProperty("RegistrationStatus") 
    public String registrationStatus;
    @JsonProperty("AccountList") 
    public AccountList accountList;
}