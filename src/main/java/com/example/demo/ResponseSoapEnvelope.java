package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ResponseSoapEnvelope{
    
    @JsonProperty("Header") 
    public ResponseHeader header;
    public ResponseSoapBody soap$Body;
}