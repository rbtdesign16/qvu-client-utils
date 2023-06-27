/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rbt.qvu.client.utils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rbtuc
 */
public class UserInformation {
    private String userId;
    private String lastName;
    private String firstName;
    private boolean newUser;
    private List<UserAttribute> attributes = new ArrayList<>();
    private List<String> roles = new ArrayList<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<UserAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<UserAttribute> attributes) {
        this.attributes = attributes;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isNewUser() {
        return newUser;
    }

    public void setNewUser(boolean newUser) {
        this.newUser = newUser;
    }
    
    
}
