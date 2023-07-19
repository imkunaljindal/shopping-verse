package com.example.shoppingverse.exception;

import com.example.shoppingverse.repository.SellerRepository;

public class SellerNotFoundException extends RuntimeException{

    public SellerNotFoundException(String message){
        super(message);
    }
}
