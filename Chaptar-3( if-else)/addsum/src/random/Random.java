
package random;

import java.util.Scanner;


public class Random {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 1st Number ");
        int num1=scanner.nextInt();
        System.out.println("Please Enter 2nt number");
        int num2=scanner.nextInt();
        System.out.println("Please Enter open the switch");
        int number=scanner.nextInt();
        
        switch ( number) {
            case 1:
                System.out.println("Adds"+num1+num2);
                break;
                
                 case 2:
                System.out.println(("dhsj")+(num1-num2));
                break;
                
                 case 3:
                System.out.println("Multiplies "+num1*num2);
                break;
                
                 case 4:
                System.out.println("Divides "+num1/num2);
                break;
                default:
                    System.out.println("Invalid operation"); 
           
        }
    }
  
}
