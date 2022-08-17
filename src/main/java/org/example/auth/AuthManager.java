package org.example.auth;

import org.example.auth.request.Request;
import org.example.auth.excption.NotAuthenticatedException;
import org.example.auth.handler.BasicRequestHandler;
import org.example.auth.handler.TokenRequestHandler;

/**
 * @author zaki
 */
public class AuthManager {

    final BasicRequestHandler basicHandler ;
    final TokenRequestHandler tokenRequestHandler;

    public AuthManager(){
        basicHandler=new BasicRequestHandler();
        tokenRequestHandler= new TokenRequestHandler();
        basicHandler.setNextHandler(tokenRequestHandler);
    }

    public void authenticate(Request request) throws NotAuthenticatedException {
        basicHandler.handle(request);
    }

}
