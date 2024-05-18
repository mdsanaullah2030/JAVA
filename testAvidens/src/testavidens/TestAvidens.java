package testavidens;

import java.util.Scanner;

public class TestAvidens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the first number:"); 
        double num1 = scanner.nextDouble(); 
        
        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble(); 

        try {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } catch (ArithmeticException e) {
        
        
        }
         
        
    }
}
