package descending;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Descending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] input = new Integer[5];
        
        System.out.println("Please enter 5 integers:");
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }
        
        Arrays.sort(input, Collections.reverseOrder());
        
        System.out.println("Sorted array in descending order:");
        for (int num : input) {
            System.out.print(num + " ");
//        }
    }
}
}