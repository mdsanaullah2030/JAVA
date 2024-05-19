package testmultidimentionarrays;

import java.util.Scanner;
import java.util.Arrays;

public class processingArrays {

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Scanner input = new Scanner(System.in);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
               matrix[row][col]=input.nextInt();
            }
            System.out.println(Arrays.deepToString(matrix));
        }
        

    }
}
