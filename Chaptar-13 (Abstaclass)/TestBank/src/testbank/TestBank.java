
package testbank;

import java.util.Scanner;
import test.BankAccuont;
import test.SavingsAccoun;


public class TestBank {

 
    public static void main(String[] args) {
        System.out.println("Plese Enter Balance:");
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        System.out.println("Please Enter amount:");
        int y=input.nextInt();
        System.out.println("Please Enter withdraw amount:");
        int x=input.nextInt();
        
        BankAccuont s=new SavingsAccoun(500, "crent Accuont", m);
        s.deposit(y);
        
        s.withdraw(y);
        
    }
    
}
