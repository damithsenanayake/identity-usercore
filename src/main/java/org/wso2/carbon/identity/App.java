package org.wso2.carbon.identity;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter User Name : ");

        String userName = input.next();

        System.out.println(" Enter Password : ");

        String password = input.next();

        UserRealmService realmService = new UserRealmService();

        AuthenticationManager authManager = realmService.getAuthenticationManager();

        if (authManager.authenticate(userName, password)) {
            System.out.println("Authentication Successful");
        }
    }
}
