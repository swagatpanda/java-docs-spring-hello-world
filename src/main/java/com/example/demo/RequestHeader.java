package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestHeader{
    @JsonProperty("Security") 
    public Security security;
    @JsonProperty("ServiceRequestInfo") 
    public ServiceRequestInfo serviceRequestInfo;
}