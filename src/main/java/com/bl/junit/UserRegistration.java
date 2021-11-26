package com.bl.junit;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean checkFirstNameIsCorrect(String firstName) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}+$", firstName);
        if (check)
            System.out.println("FirstName is correct");
        else
            System.out.println("Please Enter a Valid First name");
        return check;
    }
    public static boolean checkLastNameIsCorrect(String lastName ){
        boolean check=Pattern.matches("^[A-Z]{1}+[a-z]{3,}+$",lastName);
        if(check)
            System.out.println("lastName is correct");
        else
            System.out.println("Please Enter a valid Lastname");
        return check;
    }

}


