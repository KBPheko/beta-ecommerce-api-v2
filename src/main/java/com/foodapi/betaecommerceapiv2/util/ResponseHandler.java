package com.foodapi.betaecommerceapiv2.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * This class generates a response object*/
public class ResponseHandler {

    public static ResponseEntity<Object> generateResponse(String customMessage, HttpStatus httpStatus, Object responseObject){
        Map<String, Object> response = new HashMap<>();
        response.put("Message: ", customMessage);
        response.put("Http Status: ", httpStatus);
        response.put("Data: ", responseObject);

        return new ResponseEntity<>(response, httpStatus);
    }
}
