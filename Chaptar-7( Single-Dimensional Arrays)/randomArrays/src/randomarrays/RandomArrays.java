
package randomarrays;

import java.util.Arrays;
import java.util.Random;


public class RandomArrays {

  
    public static void main(String[] args) {
        
      int []number=new int[10];
      for(int i=0;i<number.length;i++){
          Random random=new Random();
          int num=random.nextInt(20);
          number[i]=num;
          
           System.out.println(Arrays.toString(number));
      }
       
        
    }
    
}
