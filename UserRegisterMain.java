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

public class UserRegisterMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        // method calling to check whether the name is written in proper way or not.
        System.out.println(UserRegisterTest.isValidFirstName(firstName));

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println(UserRegisterTest.isValidLastName(lastName));

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println(UserRegisterTest.isValidEmail(email));

        System.out.println("Enter phone Number with country code(space between country code and phone Number): ");
        String phoneNumber = scanner.nextLine();
        System.out.println(UserRegisterTest.isValidPhoneNumber(phoneNumber));

        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        System.out.println(UserRegisterTest.isValidPassword(password));
    }
}