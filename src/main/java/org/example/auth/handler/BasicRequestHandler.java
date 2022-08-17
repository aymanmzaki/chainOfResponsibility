package org.example.auth.handler;

import lombok.NoArgsConstructor;
import org.example.auth.excption.NotAuthenticatedException;
import org.example.auth.request.BasicRequest;
import org.example.auth.request.Request;

/**
 * @author zaki
 */
@NoArgsConstructor
public class BasicRequestHandler extends BaseHandler{

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
