package test;


import java.util.Random;
import java.util.Scanner;

public class AvidenceArray {

    public static void main(String[] args) {

  int[] randomNumbers = new int[100];
        Random random = new Random();
        
        for (int i = 0; i < 100; i++) {
            randomNumbers[i] = random.nextInt(100); 
        }

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index ");

        try {
            int index = scanner.nextInt();

            System.out.println("Element at index " + index + ": " + randomNumbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}
