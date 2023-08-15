/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.usermanagementproject;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class UserServiceTest {
    
    public UserServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addUser method, of class UserService.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User newUser = new User("admin", "Administator", "pass@1234", 'M', 'A');
        UserService instance = new UserService();
        User expResult = newUser;
        User result = instance.addUser(newUser);
        assertEquals(expResult, result);        assertEquals(1, result.getId());

        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getUser method, of class UserService.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        int index = 0;
        UserService instance = new UserService();
        User expResult = null;
        User result = instance.getUser(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsers method, of class UserService.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        UserService instance = new UserService();
        ArrayList<User> expResult = null;
        ArrayList<User> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class UserService.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        UserService instance = new UserService();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
