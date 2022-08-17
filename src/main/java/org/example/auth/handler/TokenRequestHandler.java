package org.example.auth.handler;

import lombok.NoArgsConstructor;
import org.example.auth.excption.NotAuthenticatedException;
import org.example.auth.request.Request;
import org.example.auth.request.TokenRequest;

/**
 * @author zaki
 */
@NoArgsConstructor
public class TokenRequestHandler extends BaseHandler{
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
