/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.rbt.qvu.client.utils;

import java.util.List;

/**
 *
 * @author rbtuc
 */
public interface QvuAuthenticationService {
    public boolean authenticate(String user, String pass) throws AuthenticationException;
    public UserInformation getUserInformation(String user);
    public List<UserInformation> getAllUsers();
    public List<String> getAllRoles();
    // this is a test
}
