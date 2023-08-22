/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rbt.qvu.client.utils;

import java.io.Serializable;

/**
 *
 * @author rbtuc
 */
public class OperationResult <T> {
    public static final int SUCCESS = 0;
    public static final int RECORD_EXISTS = 1;
    public static final int EXISTING_RECORD_UPDATED = 2;
    public static final int RECORD_NOT_FOUND = 3;
    public static final int UNEXPECTED_EXCEPTION = 4;
    private int errorCode = SUCCESS;
    private String message;
    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
    
    public boolean isSuccess() {
        return (errorCode == SUCCESS);
    }
}
