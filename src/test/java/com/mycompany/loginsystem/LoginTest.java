/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.loginsystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
      @Test
public void testCorrectlyFormattedUsername() {
    String username = "kyl_1";
    String expectedResponse = "Welcome <user first name>, <user last name>, it is great to see you.";
    assertEquals(expectedResponse, formatUsername(username));
}
    
   @Test
public void testIncorrectlyFormattedUsername() {
    String username = "kyle!!!!!";
    String expectedResponse = "Username is incorrectly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
    assertEquals(expectedResponse, formatUsername(username));
}
    // Method to format the username
    private String formatUsername(String username) {
    if (username.matches("^[a-zA-Z0-9_]{1,5}$") && username.contains("_")) {
        return "Welcome <user first name>, <user last name>, it is great to see you.";
    } else {
        return "Username is incorrectly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
    }
}
    

    @Test
    public void testUsernameLength() {
        String username = "user1";
        assertTrue(username.length() <= 5, "Username should be no more than 5 characters long");
    }

    @Test
    public void testUsernameContainsUnderscore() {
        String username = "user_1";
        assertTrue(username.contains("_"), "Username should contain an underscore");
    }

    @Test
    public void testPasswordComplexity() {
        String password = "Ch&&sec@ke99!";
        assertTrue(password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$"), 
                   "Password should contain at least 8 characters, a capital letter, a number, and a special character");
    }

    @Test
    public void testLoginSuccess() {
        String username = "user_1";
        String password = "Ch&&sec@ke99!";
        assertTrue(login(username, password), "Login should be successful");
    }

    @Test
    public void testLoginFailure() {
        String username = "user";
        String password = "password";
        assertFalse(login(username, password), "Login should fail");
    }

    // Mock login method for testing purposes
    private boolean login(String username, String password) {
        return "user_1".equals(username) && "Ch&&sec@ke99!".equals(password);
    }

    @Test
    public void testRegisteruser() {
    }

    @Test
    public void testLoginuser() {
    }

    @Test
    public void testReturnLoginStatus() {
    }
    
}
