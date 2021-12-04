package com.bridgelabz.junit.test;

import com.bl.junit.UserRegistration;
import com.bl.junit.UserRegistrationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();




    @Test
    public void checkGivenFirstNameIsValidAndShouldReturnHappy() throws UserRegistrationException {
        String checkMood = "HAPPY";
        String ActualMood = userRegistration.FirstName("Anjali");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenFirstNameIsInValidAndShouldReturnSad() throws UserRegistrationException {
        String checkMood = "SAD";
        String ActualMood = userRegistration.FirstName("Teja");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenLastNameIsValidAndShouldReturnHappy() throws UserRegistrationException {
        String checkMood = "HAPPY";
        String ActualMood = userRegistration.LastName("B");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenLastNameIsInValidAndShouldReturnSad() throws UserRegistrationException {
        String checkMood = "SAD";
        String ActualMood = userRegistration.LastName("P");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenMobileNumberIsValidAndShouldReturnHappy() throws UserRegistrationException {
        String checkMood = "HAPPY";
        String ActualMood = userRegistration.MobileNumber("91 9491328345");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenMobileNumberIsInValidAndShouldReturnSad() throws UserRegistrationException {
        String checkMood = "SAD";
        String ActualMood = userRegistration.MobileNumber("912339488564");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenEmailIsValidAndShouldReturnHappy() throws UserRegistrationException {
        String checkMood = "HAPPY";
        String ActualMood = userRegistration.Email("anjali@bl.co");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenEmailIsInValidAndShouldReturnSad() throws UserRegistrationException {
        String checkMood = "SAD";
        String ActualMood = userRegistration.Email("teja@gmail.co");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenPasswordIsValidAndShouldReturnHappy() throws UserRegistrationException {
        String checkMood = "HAPPY";
        String ActualMood = userRegistration.PassWord("Anjalianjali");
        Assertions.assertEquals(checkMood, ActualMood);
    }
    @Test
    public void checkGivenPasswordIsInValidAndShouldReturnSad() throws UserRegistrationException {
        String checkMood = "SAD";
        String ActualMood = userRegistration.PassWord("anjali");
        Assertions.assertEquals(checkMood, ActualMood);
    }
}