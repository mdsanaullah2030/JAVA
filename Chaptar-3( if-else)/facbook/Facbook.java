package com.mycompany.facbook;

import java.util.Scanner;

public class Facbook {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Entaer user name");
        String userName = input.next();
        String masserg = String.format("Wclcome%s", userName);
        System.out.println("Please Entaer user name");
        String password = input.next();
        if (userName.equalsIgnoreCase("sanaullah") && password.equals("Java")) {

            System.out.println(masserg);

        } else {
            System.out.println("invalid Password");
        }
    }
}
