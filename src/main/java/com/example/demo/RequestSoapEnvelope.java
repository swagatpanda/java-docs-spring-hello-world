package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RequestSoapEnvelope{
    
    public String @xmlns$soap;

    @JsonProperty("Header") 
    public RequestHeader header;
    public RequestSoapBody soap$Body;
}