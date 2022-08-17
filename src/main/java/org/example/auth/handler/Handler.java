package org.example.auth.handler;

import org.example.auth.excption.NotAuthenticatedException;
import org.example.auth.Request.Request;

/**
 * @author zaki
 */
public interface Handler {
    public void setNextHandler(Handler handler);
    public void handle(Request request) throws NotAuthenticatedException;
}