package org.rbtdesign.qvu.client.utils;

/**
 *
 * @author rbtuc
 */
public interface ResponseFilter <T> {
     public void handleResponse(T requestPayload);
}
