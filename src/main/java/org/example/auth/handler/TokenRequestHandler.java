package org.example.auth.handler;

import org.example.auth.excption.NotAuthenticatedException;
import org.example.auth.Request.Request;
import org.example.auth.Request.TokenRequest;

/**
 * @author zaki
 */
public class TokenRequestHandler extends BaseHandler{

    public TokenRequestHandler(){}

    public TokenRequestHandler(Handler handler){
        this.setNextHandler(handler);
    }
    public void handle(Request request) throws NotAuthenticatedException {
        if (request instanceof TokenRequest){
            System.out.println("Handle TokenRequest Request Logic");
        }else if(next!=null) {
            next.handle(request);
        }else {
            throw new NotAuthenticatedException();
        }
    }
}
