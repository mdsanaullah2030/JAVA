

package com.mycompany.namewelcome;

import java.util.Scanner;


public class NameWelcome {

    public static void main(String[] args) {
        Scanner userName=new Scanner(System.in);
        String name=userName.next();
        System.out.println("Welcom" +name);
    }
}
