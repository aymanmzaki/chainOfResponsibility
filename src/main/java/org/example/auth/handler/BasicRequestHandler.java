package org.example.auth.handler;

import org.example.auth.excption.NotAuthenticatedException;
import org.example.auth.Request.BasicRequest;
import org.example.auth.Request.Request;

/**
 * @author zaki
 */
public class BasicRequestHandler extends BaseHandler{

    public BasicRequestHandler(){}

    public BasicRequestHandler(Handler handler){
        this.setNextHandler(handler);
    }

    public void handle(Request request) throws NotAuthenticatedException {
        if (request instanceof BasicRequest){
            System.out.println("Handle Basic Request Logic");
        }else if(next!=null) {
            next.handle(request);
        }else {
            throw new NotAuthenticatedException();
        }
    }
}
