/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermanagementproject;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class UserService {

    private ArrayList<User> userList;
    private int lastId = 1;

    public UserService() {
        userList = new ArrayList<User>();
    }

    public User addUser(User newUser) {
        newUser.setId(lastId++);
        userList.add(newUser);
        return newUser;
    }

}
