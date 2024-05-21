
package test;

   import java.util.Random;
import java.util.Scanner;

public class number {
 
    
 


    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(100);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        try {
            int element = randomArray[index];
            System.out.println("Element at index " + index + " is: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}

    
    
    
    
    
    



