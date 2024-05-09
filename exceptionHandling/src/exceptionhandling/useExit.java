
package exceptionhandling;

import java.util.Scanner;


public class useExit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 1st Number");
        int number1=scanner.nextInt();
        System.out.println("Please Enter 2nt Number");
        int number2=scanner.nextInt();
        if(number2==0){
            System.out.println("Result "+ number1/number2);
          
        }
       
    }
     
}
