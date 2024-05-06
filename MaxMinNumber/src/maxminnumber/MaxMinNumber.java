
package maxminnumber;

import java.util.Random;
import test.MaxMin;


public class MaxMinNumber {

   
    public static void main(String[] args) {
    
        Random random=new Random();
        int sumi=random.nextInt(30)+1;
         MaxMin add=new MaxMin();
     add.number1=random.nextInt();
     add.number2=random.nextInt();
     add.number3=random.nextInt();
     
        System.out.println("MAX");
        System.out.println(add.finemax());
        System.out.println("MIN");
        System.out.println(add.minNumber());
       
    }
    
}
