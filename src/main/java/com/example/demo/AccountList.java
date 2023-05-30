package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountList{
    @JsonProperty("Account") 
    public Account account;
}

