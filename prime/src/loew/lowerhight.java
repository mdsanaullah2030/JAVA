
package loew;

import java.util.Scanner;


public class lowerhight {
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double lowest = numbers[0];
        double highest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        System.out.println("lowest "+lowest);
        System.out.println("highest "+highest);
    }
}
