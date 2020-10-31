/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import java.util.Scanner;

/**
 * A class to validate a user's chosen password. The password must have a length
 * of at least 8 at least one uppercase character and at least one special
 * character (character that is not a letter or number). This is also our class
 * under test. Starter code for ICE 3
 *
 * @author dancye, 2018
 * @author purvp, 2020
 */
public class PasswordValidator {

    /**
     * Main method cycles through our static utility methods to determine
     * whether the password is valid or not.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isValid = false;
        do {
            System.out.println("Please enter a VALID password, "
                    + "password must have:");
            System.out.println("A length of at least 8");
            System.out.println("At least one special character");
            System.out.println("At least one uppercase letter");
            Scanner sc = new Scanner(System.in);
            String pass = sc.nextLine();
            if (checkLength(pass) && checkSpecialChar(pass)
                    && checkUpperCase(pass)) {
                isValid = true;
            }
        } while (!isValid);
        System.out.println("Valid password, accepted!");
    }

    /**
     * A method to check whether a password is at least length 8
     *
     * @param pass - the String to check
     * @return true if length is greater than or equals to 8 and false otherwise
     */
    public static boolean checkLength(String pass) {
        if (pass.length() >= 8) {
            return true;
        }
        return false;
    }

    /**
     * A method to check whether a password has at least one special character
     *
     * @param pass - the String to check 
     * specialCharCount will count the number of special character
     * @return true if password has at least one special character and false
     * otherwise
     */
    public static boolean checkSpecialChar(String pass) {
        int specialCharCount = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (!(Character.isLetterOrDigit(pass.charAt(i)))) {
                //now we know there is at least one special character
                specialCharCount++;
            }
        }
        if (specialCharCount > 0 && pass.length() > 7) {
            return true;
        }
        return false;
    }

    /**
     * A method to check whether a password has at least one UpperCase letter
     *
     * @param pass - the String to check 
     * upperCase will count the number of UpperCase letter
     * @return true if password has at least one UpperCase letter and false
     * otherwise
     */
    public static boolean checkUpperCase(String pass) {
        int upperCase = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                //now we know there is at least one special character
                upperCase++;
            }
        }
        if (upperCase > 0 && pass.length() > 7) {
            return true;
        }
        return false;
    }

}
