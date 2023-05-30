package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceRequestInfo{
    @JsonProperty("RequestDateTime") 
    public String requestDateTime;
    @JsonProperty("RequestID") 
    public String requestID;
    @JsonProperty("SesstionID") 
    public String sesstionID;
    @JsonProperty("UserID") 
    public String userID;
}