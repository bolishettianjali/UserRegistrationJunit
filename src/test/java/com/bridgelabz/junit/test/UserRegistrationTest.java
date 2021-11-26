package com.bridgelabz.junit.test;

import com.bl.junit.UserRegistration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();
    @Test
    public void firstName(){
        String firstName="Anjali";
        boolean check=userRegistration.checkFirstNameIsCorrect(firstName);
        assertTrue(check);
    }
    @Test
    public void lastName(){
        String lastName = "Bolishetti";
        boolean check = userRegistration.checkLastNameIsCorrect(lastName);
        assertTrue(check);
    }
    @Test
    public void eMail(){
        String eMail = "anjali@gmail.com";
        boolean check = userRegistration.checkEmailIsCorrect(eMail);
        assertTrue(check);
    }
}
