/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rbt.qvu.client.utils;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import javax.security.auth.Subject;

/**
 *
 * @author rbtuc
 */
public class User implements Principal {
    private String userId;
    private String lastName;
    private String firstName;
    private String email;
    private String password;
    private boolean newRecord;
    private List<UserAttribute> attributes = new ArrayList<>();
    private List<String> roles = new ArrayList<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isNewRecord() {
        return newRecord;
    }

    public void setNewRecord(boolean newRecord) {
        this.newRecord = newRecord;
    }

       public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
    public String getName() {
        return userId;
    }
    

    @Override
    public boolean implies(Subject subject) {
        return !subject.getPrincipals(User.class).isEmpty(); 
    }
}
