package org.example.auth.excption;

/**
 * @author zaki
 */
public class NotAuthenticatedException extends Exception{
    public NotAuthenticatedException(){
        super("Not Authenticated Exception");
    }
}
