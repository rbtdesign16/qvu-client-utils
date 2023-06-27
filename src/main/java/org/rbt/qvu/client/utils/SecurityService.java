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
public interface SecurityService {
    public boolean authenticate(String user, String pass) throws AuthenticationException;
    public User getUser(String user);
    public List<User> getAllUsers();
    public List<Role> getAllRoles();
    public int saveUser(User user) throws SaveException;
    public int saveRole(Role role) throws DeleteException;
    public int deleteUser(String userId) throws SaveException;;
    public int deleteRole(String roleName) throws DeleteException;;
}
