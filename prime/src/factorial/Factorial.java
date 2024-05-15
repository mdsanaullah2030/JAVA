
package factorial;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
          int number = 5;

        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);

        
    }
}
