
package prime;

import java.util.Scanner;


public class Prime {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
      int cound =0;
        for (int i=1; i<number; i++) {
            if (number%i==0) {


                cound+=1;

            }
        }
        if (cound==2) {
            System.out.println("it is a prime number");

        }
        else {
            System.out.println("it is a prime number");
        }
    }
    
}
