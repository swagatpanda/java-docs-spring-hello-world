package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ServiceResponseInfo{
    @JsonProperty("RequestDateTime") 
    public String requestDateTime;
    @JsonProperty("RequestID") 
    public String requestID;
    @JsonProperty("SesstionID") 
    public String sesstionID;
    @JsonProperty("UserID") 
    public String userID;
    @JsonProperty("ReturnCode") 
    public String returnCode;
    @JsonProperty("ReasonCode") 
    public String reasonCode;
    @JsonProperty("ReasonMessage") 
    public String reasonMessage;
    @JsonProperty("Detail") 
    public String detail;
}
