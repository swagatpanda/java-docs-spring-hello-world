package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AchAccount{
    @JsonProperty("Nickname") 
    public String nickname;
    @JsonProperty("AccountNumberLast4") 
    public String accountNumberLast4;
    @JsonProperty("AccountType") 
    public String accountType;
}