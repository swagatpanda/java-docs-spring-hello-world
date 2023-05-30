package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ResponseSoapEnvelope{
    
    @JsonProperty("Header") 
    public Header header;
    public SoapBody soap$Body;
}