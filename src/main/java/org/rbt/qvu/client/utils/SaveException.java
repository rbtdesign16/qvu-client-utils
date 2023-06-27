/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rbt.qvu.client.utils;

/**
 *
 * @author rbtuc
 */
public class SaveException extends Exception {
    private OperationResult opResult;
    public SaveException(String message) {
        super(message);
    }
    
    public SaveException(String message, Throwable t) {
        super(message, t);
    }
    
    public SaveException(OperationResult opResult) {
        super("error[" + opResult.getErrorCode() + "]: " + opResult.getMessage());
        this.opResult = opResult;
    }

    public OperationResult getOpResult() {
        return opResult;
    }

    public void setOpResult(OperationResult opResult) {
        this.opResult = opResult;
    }
}
