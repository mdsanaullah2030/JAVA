
package Array;

import java.util.Arrays;
import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
       
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " numbers to add to the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Array contents: "+Arrays.toString(array));
        
        for (int num : array) {
            System.out.print(num );
            
        }
    }
}
    
        
        
       
    





