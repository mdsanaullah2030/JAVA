package oddnumbersum;

import java.util.Scanner;

public class OddNumberSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number = scanner.nextInt();
        int sum = 0;

       
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {  
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers up to " + number + " is: " + sum);
    }
}
