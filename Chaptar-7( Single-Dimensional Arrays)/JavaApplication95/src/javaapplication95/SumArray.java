
package javaapplication95;

import java.util.Random;


public class SumArray {

 
    public static void main(String[] args) {
        int[]myList=new int[20];
        Random random=new Random();
        for(int i=1;i<myList.length;i++){
        int num=random.nextInt();
        myList[i]=num;
            System.out.print (" "+i);
        }
        
    }
    
}
