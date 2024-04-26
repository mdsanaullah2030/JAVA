

package com.mycompany.gmail;

import java.util.Scanner;


public class Gmail {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter user name");
        String userName=s.next();
        String masserg=String.format("wlecome%s", userName);
        if(userName.equalsIgnoreCase("sanaullah")){
            System.out.println("Please enter password");
        String pasword=s.next();
          if(pasword.equals("1234")){
              System.out.println(masserg);
          }  
          else{
              System.out.println("incorrect pasword");
          }
        }
        else{
            System.out.println("donot finet google accunt");
        }
    }
}
