package testmultidimentionarrays;

import java.util.Arrays;
import java.util.Random;

public class TestMultidimentionArrays {

    public static void main(String[] args) {
     
        int[][] number = new int[4][5];
        Random random = new Random();
        
        for (int row = 0; row < number.length; row++) {
            for (int column = 0; column < number[1].length; column++) {
                int randomNumber = random.nextInt(20);
                number[row][column] = randomNumber;
            }
        }
        for(int row=0;row<number.length;row++){
        for(int col=0;col<number[0].length;col++){
            int input=random.nextInt(50);
            number[row][col]=input;
            
        }
        }
        for(int row=0;row<number.length;row++){
            for(int col=0;col<number[0].length;col++){
            int add=random.nextInt(50);
            number[row][col]=add;
            }
        }
         
        System.out.println(Arrays.deepToString(number));
        System.out.println(Arrays.deepToString(number));
        System.out.println(Arrays.deepToString(number));

    }
}
