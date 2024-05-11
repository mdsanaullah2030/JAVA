
package avidence;

//import java.util.Scanner;

import java.util.Scanner;



public class Avidence {

   
    public static void main(String[] args) {
        
  
        Scanner scanner=new Scanner(System.in);
       
         int total = 0;
        
        while (true) {
            System.out.print("Enter an integer (or a negative integer to stop): ");
            int number = scanner.nextInt();
            if (number <=0) {
                break;
            }
            total += number;
                   
        }
        
        System.out.println("The sum of positive integers is: " + total);
        scanner.close();
    }
}
