package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckUserRegistrationStatus{
    @JsonProperty("BillerGroupID") 
    public String billerGroupID;
    @JsonProperty("BillerID") 
    public String billerID;
    @JsonProperty("UserID") 
    public String userID;
}