package org.example.auth.handler;

import org.example.auth.excption.NotAuthenticatedException;
import org.example.auth.request.Request;

/**
 * @author zaki
 */
public interface Handler {
    void handle(Request request) throws NotAuthenticatedException;
}