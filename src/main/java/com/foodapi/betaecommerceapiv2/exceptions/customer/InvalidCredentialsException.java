package com.foodapi.betaecommerceapiv2.exceptions.customer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class InvalidCredentialsException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidCredentialsException(String errorMessage){
        super(errorMessage);
    }
}
