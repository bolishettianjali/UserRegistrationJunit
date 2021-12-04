package com.bl.junit;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    public String FirstName(String firstName) throws UserRegistrationException {
        String regex = "^[A-Z]{1}+[a-z]{3,}+$";
        try {
            Pattern pattern = Pattern.compile(regex);
            if (firstName.isEmpty())
                throw new UserRegistrationException("Please Enter a Valid First name");
            Matcher matcher = pattern.matcher(firstName);
            if (((Matcher) matcher).matches()) {
                System.out.println("Valid Firstname!!");
                System.out.println(analyseMood("HAPPY"));
                return "HAPPY";
            } else
                return "SAD";
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("Please Enter a Valid First name");
        }
    }
    public String LastName (String lastName) throws UserRegistrationException {
        String regex = "^[A-Z]{1}+[a-z]{3,}+$";
        try {
            Pattern pattern = Pattern.compile(regex);
            if (lastName.isEmpty())
                throw new UserRegistrationException("Please Enter a Valid Last name");
            Matcher matcher = pattern.matcher(lastName);
            if (matcher.matches()) {
                System.out.println("Valid Lastname!!");
                System.out.println(analyseMood("HAPPY"));
                return "HAPPY";
            } else
                return "SAD";
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("Please Enter a Valid Last name");
        }
    }
    public String MobileNumber(String mobile) throws UserRegistrationException {
        String regex = "^91\\\\s[6789][0-9]{9}";
        try {
            Pattern pattern = Pattern.compile(regex);
            if (mobile.isEmpty())
                throw new UserRegistrationException("Please Enter a Valid Mobile Number");
            Matcher matcher = pattern.matcher(mobile);
            if (matcher.matches()) {
                System.out.println("Valid Mobile Number!!");
                System.out.println(analyseMood("HAPPY"));
                return "HAPPY";
            } else
                return "SAD";
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("Please Enter a Valid Mobile Number");
        }
    }
    public String Email (String email) throws UserRegistrationException {
        String regex = "^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*";
        try {
            Pattern pattern = Pattern.compile(regex);
            if (email.isEmpty())
                throw new UserRegistrationException("Please Enter a Valid Email");
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("Valid Email!!");
                System.out.println(analyseMood("HAPPY"));
                return "HAPPY";
            } else
                return "SAD";
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("Please Enter a Valid Email");
        }
    }
    public String PassWord(String password) throws UserRegistrationException {
        String regex = "[a-zA-Z]{8,}";
        try {
            Pattern pattern = Pattern.compile(regex);
            if (password.isEmpty())
                throw new UserRegistrationException("Please Enter a Valid PassWord");
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println("Valid PassWord!!");
                System.out.println(analyseMood("HAPPY"));
                return "HAPPY";
            } else
                return "SAD";
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException("Please Enter a Valid PassWord");
        }
    }

    public static String analyseMood (String message){
        if (message.contains("HAPPY")) {
            return "Registration is Successful!!";
        } else {
            return "Registration is Failed!!";
        }
    }


    public static void main (String[]args) throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.FirstName(sc.next());
        userRegistration.LastName(sc.next());
        userRegistration.MobileNumber(sc.next());
        userRegistration.Email(sc.next());
        userRegistration.PassWord(sc.next());
    }
}