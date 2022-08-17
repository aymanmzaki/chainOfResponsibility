package org.example.auth.handler;

/**
 * @author zaki
 */
public abstract class BaseHandler implements Handler {
    Handler next = null;
    public void setNextHandler(Handler handler) {
        this.next = handler;
    }

}
