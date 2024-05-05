
package javaapplication31;

import java.util.Random;
import java.util.Arrays;

public class JavaApplication31 {

    
    public static void main(String[] args) {
        int[] number=new int[20];
        for (int i=0;i<number.length;i++){  
            Random r=new Random();
            int num=r.nextInt(20)+1;
            number[i]=num;
            
            }
        
        int sum=sum(number);
        int avg=avg(number);
        int max=max(number);
 int min=min(number);
        System.out.println("sum is "+sum);
        System.out.println("avg is "+avg);
        System.out.println("max is "+max);
        System.out.println("min is "+min);
    }
   
    
    public static int sum(int[] myArry) {
        int sum=0;
      for(int val:myArry){
            sum+=val;
        
        }
      return sum;
    }
   
    
    public static int avg(int[] myArray) {
        int sum=0;
        int avg=0;
        for(int val:myArray){
            sum+=val;
        
        }
        avg=sum/myArray.length;
        return avg;
    }
    public static int max(int[] myArray) {
       int max=0;
         for(int val: myArray){
       if(max<val){
           max=val;
       }
 
    }
   return max;
}
    public static int min(int[] myArray) {
        int min=999;
      for(int val:myArray){
       if(min>val){
           min=val;
       }
   }  
      return min;
    }
}