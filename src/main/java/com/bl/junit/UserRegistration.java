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
    public static boolean checkEmailIsCorrect(String eMail) {
        boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@gmail[.]com([.]?in)*", eMail);
        if (check)
            System.out.println("Email is correct");
        else
            System.out.println("Please Enter a Valid Email");
        return check;
    }
    public static boolean checkMobileNumberFormatIsCorrect(String mobileNumber) {
        boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", mobileNumber);
        if (check)
            System.out.println("Mobile Number format is correct");
        else
            System.out.println("Please Enter a Valid Mobile Num\nMobile number format should be 91 9533182605");
        return check;

    }
    public static boolean checkPassWordRule1IsCorrect(String passWordRule1) {
        boolean check = Pattern.matches("[a-zA-Z]{8,}", passWordRule1);
        if (check)
            System.out.println("PassWord Rule 1 is correct");
        else
            System.out.println("Please Enter a Valid Password\nPassWord should be 8 characters");
        return check;
    }
    public static boolean checkPassWordRule2IsCorrect(String passWordRule2) {
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{7,}", passWordRule2);
        if (check)
            System.out.println("PassWord Rule 2 is correct");
        else
            System.out.println("Please Enter a Valid Password\nPassWord should be 8 characters\nPassWord should have 1 UpperCase");
        return check;
    }
    public static boolean checkPassWordRule3IsCorrect(String passWordRule3) {
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{6,}[0-9]{1}", passWordRule3);
        if (check)
            System.out.println("PassWord Rule 3 is correct");
        else
            System.out.println("Please Enter a Valid Password\nPassWord should be minimum 8 characters\nPassWord should have 1 UpperCase\nPassWord should have 1 numeric value");
        return check;
    }
    public static boolean checkPassWordRule4IsCorrect(String passWordRule4) {
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{6,}[0-9]{1}[!@#~$%^&*_+-=|]{1}", passWordRule4);
        if (check)
            System.out.println("PassWord Rule 4 is correct");
        else
            System.out.println("Please Enter a Valid Password\nPassWord should be minimum 8 characters\nPassWord should have 1 UpperCase\nPassWord should have 1 numeric value\nPassWord should have 1 special character");
        return check;
    }
    public static boolean emailUniversal(String eMail) {
        boolean check = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", eMail);
        if (check)
            System.out.println("Email is correct!!");
        else
            System.out.println("Please Enter a Valid Email with Only \nexample.abc@bl.co.in");
        return check;
    }
}




