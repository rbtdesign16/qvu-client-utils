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
    public static final int SUCCESS = 0;
    public static final int ERROR = 1;
    public boolean authenticate(String user, String pass) throws AuthenticationException;
    public UserInformation getUserInformation(String user);
    public List<UserInformation> getAllUsers();
    public List<RoleInformation> getAllRoles();
    public int saveUser(UserInformation user);
    public int saveRole(RoleInformation role);
    public int deleteUser(String userId);
    public int deleteRole(String roleName);
}
