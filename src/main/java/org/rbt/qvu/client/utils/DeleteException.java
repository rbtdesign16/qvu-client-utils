/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rbt.qvu.client.utils;

/**
 *
 * @author rbtuc
 */
public class DeleteException extends Exception {
    public DeleteException(String message) {
        super(message);
    }
    
    public DeleteException(String message, Throwable t) {
        super(message, t);
    }
}
