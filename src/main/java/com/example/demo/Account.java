package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account{
    @JsonProperty("Type") 
    public String type;
    @JsonProperty("Id") 
    public String id;
    @JsonProperty("AchAccount") 
    public AchAccount achAccount;
}