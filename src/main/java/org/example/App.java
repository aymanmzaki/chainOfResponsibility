package org.example;

import org.example.auth.AuthManager;
import org.example.auth.request.BasicRequest;
import org.example.auth.request.LdapRequest;
import org.example.auth.request.TokenRequest;
import org.example.auth.excption.NotAuthenticatedException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AuthManager authManager= new AuthManager();

        BasicRequest basicRequest= new BasicRequest("Ayman","123456798");

        TokenRequest tokenRequest= new TokenRequest("TOKEN");

        LdapRequest ldapRequest= new LdapRequest();

        try {
            // Basic Request Handling -- Pass
            authManager.authenticate(basicRequest);

            //Token Based Request Handling -- Pass
            authManager.authenticate(tokenRequest);

            //ldap Based Request Handling -- Fail
            authManager.authenticate(ldapRequest);

        } catch (NotAuthenticatedException e) {

            System.out.println(e.getMessage());

        }

    }
}
