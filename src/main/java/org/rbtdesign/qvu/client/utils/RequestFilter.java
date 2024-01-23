package org.rbtdesign.qvu.client.utils;

/**
 *
 * @author rbtuc
 */
public interface RequestFilter <T> {
    public void handleRequest(T requestPayload);
}
