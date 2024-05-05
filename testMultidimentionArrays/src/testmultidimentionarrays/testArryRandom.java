
package testmultidimentionarrays;

import java.util.Random;
import java.util.Arrays;

public class testArryRandom {
    public static void main(String[] args) {
        int [][]myArray= new int [5][5];
        Random random=new Random();
        for(int row=0;row<myArray.length;row++){
        for(int col=0;col<myArray[0].length;col++){
            int numbar=random.nextInt(20);
            myArray [row][col]=numbar;
        }
        }
        System.out.println(Arrays.deepToString(myArray)); 
    }
    
}
