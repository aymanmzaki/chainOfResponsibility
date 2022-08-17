package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.auth.AuthManager;
import org.example.auth.Request.BasicRequest;
import org.example.auth.Request.LdapRequest;
import org.example.auth.Request.TokenRequest;
import org.example.auth.excption.NotAuthenticatedException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AuthManager authManager= new AuthManager();

        BasicRequest basicRequest= new BasicRequest("Ayman","123456798");

        TokenRequest tokenRequest= new TokenRequest("eyJpc3MiOiJ0b3B0YWwuY29tIiwiZXhwIjoxNDI2NDIwODAwLCJodHRwOi8vdG9wdGFsLmNvbS9qd3RfY2xhaW1zL2lzX2FkbWluIjp0cnVlLCJjb21wYW55IjoiVG9wdGFsIiwiYXdlc29tZSI6dHJ1ZX0.");

        LdapRequest ldapRequest= new LdapRequest();

        try {
            // Basic Request Handling -- Pass
//            authManager.authenticate(basicRequest);

            //Token Based Request Handling -- Pass
            authManager.authenticate(tokenRequest);

            //ldap Based Request Handling -- Fail
//            authManager.authenticate(ldapRequest);

        } catch (NotAuthenticatedException e) {

            System.out.println(e.getMessage());

        }

    }
}
