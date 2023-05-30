package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RequestSoapEnvelope{

    @JsonProperty("Header") 
    public RequestHeader header;
    public RequestSoapBody soap$Body;
}