package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseHeader{
    @JsonProperty("ServiceResponseInfo") 
    public ServiceResponseInfo serviceResponseInfo;
}