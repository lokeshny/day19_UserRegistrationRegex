package com.Bridgelab.day19_Regex;

import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegisterTest{


    /*
     * isValidFirstName method created in which First Name starts with Cap and has minimum 3 Characters.
     */
    public static boolean isValidFirstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$",firstName);
    }
}

