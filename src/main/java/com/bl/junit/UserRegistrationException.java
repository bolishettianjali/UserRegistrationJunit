package com.bl.junit;

public class UserRegistrationException extends Throwable {
    public UserRegistrationException(String message){
        super(message);
        System.out.println(message);
    }
}
