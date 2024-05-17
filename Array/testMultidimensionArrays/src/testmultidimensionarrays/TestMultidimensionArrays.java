
package testmultidimensionarrays;

import java.util.Arrays;
import java.util.Random;

public class TestMultidimensionArrays {

 
    public static void main(String[] args) {
     
        
        
        

        
        int[][] numers=new int[3][4];
        int[][] numers1=new int[3][4];
        
        Random random=new Random();
        
        for(int row=0; row<numers.length; row++){
            for(int column=0; column<numers[1].length; column++){
                int randomNumber=random.nextInt(20);
                numers[row][column]=randomNumber;
            }        
        }
                for(int row=0; row<numers1.length; row++){
            for(int column=0; column<numers1[1].length; column++){
                int randomNumber=random.nextInt(20);
                numers1[row][column]=randomNumber;
            }        
        }
        
        
        
        System.out.println(Arrays.deepToString(numers));
        System.out.println(Arrays.deepToString(numers1));
        
    }
    
}
    
    

