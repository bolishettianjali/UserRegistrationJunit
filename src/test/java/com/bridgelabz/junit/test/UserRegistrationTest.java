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
    @Test
    public void mobileNumber(){
        String mobileNumber="91 9491328183";
        boolean check=userRegistration.checkMobileNumberFormatIsCorrect(mobileNumber);
        assertTrue(check);
    }
    @Test
    public void passWordRule1(){
        String password="Anjalianjali";
        boolean check=userRegistration.checkPassWordRule1IsCorrect(password);
        assertTrue(check);
    }
    @Test
    public void passWordRule2(){
        String password2 = "Anjalianjali";
        boolean check = userRegistration.checkPassWordRule2IsCorrect(password2);
        assertTrue(check);
    }
    @Test
    public void passWordRule3(){
        String password3 = "Anjalianjali1";
        boolean check = userRegistration.checkPassWordRule3IsCorrect(password3);
        assertTrue(check);
    }
    @Test
    public void passWordRule4(){
        String passWord3 = "Anjalianjali1@";
        boolean check = userRegistration.checkPassWordRule4IsCorrect(passWord3);
        assertTrue(check);
    }
}
