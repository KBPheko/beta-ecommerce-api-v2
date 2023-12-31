package com.foodapi.betaecommerceapiv2.exceptions.cart;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CartNotFoundException extends Exception{

    public CartNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
