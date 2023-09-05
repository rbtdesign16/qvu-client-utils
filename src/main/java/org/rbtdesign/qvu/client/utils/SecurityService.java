/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.rbtdesign.qvu.client.utils;

import java.util.List;

/**
 *
 * @author rbtuc
 */
public interface SecurityService {
    public boolean authenticate(String user, String pass) throws AuthenticationException;
    public User getUser(String user);
    public List<User> getAllUsers();
    public List<Role> getAllRoles();
    public OperationResult saveUser(User user) throws SaveException;
    public OperationResult saveRole(Role role) throws SaveException;
    public OperationResult deleteUser(String userId) throws DeleteException;;
    public OperationResult deleteRole(String roleName) throws DeleteException;;
}
