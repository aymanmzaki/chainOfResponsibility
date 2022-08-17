package org.example.auth;

import org.example.auth.Request.Request;
import org.example.auth.excption.NotAuthenticatedException;
import org.example.auth.handler.BasicRequestHandler;
import org.example.auth.handler.TokenRequestHandler;

/**
 * @author zaki
 */
public class AuthManager {

    BasicRequestHandler basicHandler ;
    TokenRequestHandler tokenRequestHandler;

    public AuthManager(){
        basicHandler=new BasicRequestHandler();
        tokenRequestHandler= new TokenRequestHandler();
        basicHandler.setNextHandler(tokenRequestHandler);
    }

    public void authenticate(Request request) throws NotAuthenticatedException {
        basicHandler.handle(request);
    }

}
