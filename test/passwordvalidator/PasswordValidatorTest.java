/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * A class to test the methods in our passwordValidator To be used as starter
 * code for ICE 4
 *
 * @author dancye, 2018
 * @author purvp, 2020
 */
public class PasswordValidatorTest {

    public PasswordValidatorTest() {
    }

    public static void setUpClass() {
    }

    public static void tearDownClass() {
    }

    public void setUp() {
    }

    public void tearDown() {
    }

    /**
     * Test of checkLengthGood method, of class PasswordValidator. This test
     * gives a good input of MyPassword123, which should easily be long enough
     * to be a good length.
     */
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLengthGood");
        String pass = "Password*123";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);

    }

    /*
     *Test of checkLengthBad method, of class PasswordValidator.
     * A test that will ensure a failing password actually
     * returns false from the checkLength method
     */
    @Test
    public void testCheckLengthBad() {
        System.out.println("checkLengthBad");
        String pass = "pass";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkLengthBoundary method, of class PasswordValidator. This test
     * gives a good input of MyPassword123, which should easily be long enough
     * to be a good length.
     */
    @Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLengthBoundary");
        String pass = "MyPassword123";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkSpecialCharGood method, of class PasswordValidator. This
     * test will give good result and return true, if the password has one
     * special character
     */
    @Test
    public void testCheckSpecialCharGood() {
        System.out.println("checkSpecialCharGood");
        String pass = "Password@123";
        boolean expResult = true;
        boolean result = PasswordValidator.checkSpecialChar(pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkSpecialCharBad method, of class PasswordValidator 
     * This test will give bad result and return true, if password not 
     * contain special character
     */
    @Test
    public void testCheckSpecialCharBad() {
        System.out.println("checkSpecialCharBad");
        String pass = "pass";
        boolean expResult = false;
        boolean result = PasswordValidator.checkSpecialChar(pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkSpecialCharBoundary method, of class PasswordValidator. 
     * This test will test the boundary result, check whether the password has 
     * at least one special character then return true, otherwise false
     */
    @Test
    public void testCheckSpecialCharBoundary() {
        System.out.println("checkSpecialCharBoundary");
        String pass = "!@$%^&*#";
        boolean expResult = true;
        boolean result = PasswordValidator.checkSpecialChar(pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkUpperCaseGood method, of class PasswordValidator. This test
     * will give good input, if the password has at least one UpperCase letter
     * then return true, otherwise false
     */
    @Test
    public void testCheckUpperCaseGood() {
        System.out.println("checkUpperCaseGood");
        String pass = "Mypassword123";
        boolean expResult = true;
        boolean result = PasswordValidator.checkUpperCase(pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkUpperCaseBad method, of class PasswordValidator.
     * This test is for bad result, but it will return true if password not
     * contain any UpperCase letter
     */
    @Test
    public void testCheckUpperCaseBad() {
        System.out.println("checkUpperCaseBad");
        String pass = "pass";
        boolean expResult = false;
        boolean result = PasswordValidator.checkUpperCase(pass);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkUpperCaseBoundary method, of class PasswordValidator. 
     * This boundary test will verify whether the password has at least one 
     * UpperCase letter then return true otherwise false
     */
    @Test
    public void testCheckUpperCaseBoundary() {
        System.out.println("checkUpperCaseBoundary");
        String pass = "PASSWORDCHECK";
        boolean expResult = true;
        boolean result = PasswordValidator.checkUpperCase(pass);
        assertEquals(expResult, result);
    }

}
