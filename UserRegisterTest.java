package com.Bridgelab.day19_Regex;

import java.util.regex.Pattern;

public class UserRegisterTest{
    /*
     * isValidFirstName method created in which First Name starts with Cap and has minimum 3 Characters.
     */
    public static boolean isValidFirstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$",firstName);
    }

    /*
     * lastName method created in which Last Name starts with Cap and has minimum 3 Characters.
     */
    public static boolean isValidLastName(String lastName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName);
    }

    /*
     * isValidEmail method created to validate the email
     */
    public static boolean isValidEmail(String email) {
        return Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email);
    }
    /*
     * isValidPhoneNumber method created
     * E.g. 91 9919819801 - Country code follow by space and 10 digit number
     */
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.matches("^[1-9]{2}\\s{1}[1-9]{1}[0-9]{9}$", phoneNumber);
    }
}

