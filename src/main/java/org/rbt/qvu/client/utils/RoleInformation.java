/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rbt.qvu.client.utils;

/**
 *
 * @author rbtuc
 */
public class RoleInformation {
    private String name;
    private String description;
    private boolean newRole;

    public boolean isNewRole() {
        return newRole;
    }

    public void setNewRole(boolean newRole) {
        this.newRole = newRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
