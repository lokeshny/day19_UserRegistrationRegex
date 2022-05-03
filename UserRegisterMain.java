/*
 * The User Registration System program implements an application that needs
 * to ensure all validations are in place during the User Entry.
 * UC1: As a User need to enter a valid First Name.
 *
 * @author: Lokesh N Y
 * @date: 3-5-2022
 */

package com.Bridgelab.day19_Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegisterMain{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        // method calling to check whether the name is written in proper way or not.
        System.out.println(UserRegisterMain.isValidFirstName(firstName));
    }

    private static boolean isValidFirstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}$",firstName);
    }


}

