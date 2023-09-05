/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rbtdesign.qvu.client.utils;

/**
 *
 * @author rbtuc
 */
public class DeleteException extends Exception {
   private OperationResult opResult;
    public DeleteException(String message) {
        super(message);
    }
    
    public DeleteException(String message, Throwable t) {
        super(message, t);
    }

    public DeleteException(OperationResult opResult) {
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
