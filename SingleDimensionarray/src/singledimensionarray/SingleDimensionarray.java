
package singledimensionarray;

import java.util.Arrays;
import java.util.Random;

public class SingleDimensionarray {

   
    public static void main(String[] args) {
       int []myList=new int[20];
for (int i=0;i<myList.length;i++){
    Random r=new Random();
    int num=r.nextInt(5)+1;
    myList[i]=num;
}
int sum=0;
int avg=0;
int count=0;
 int[] newList = new int[myList.length];
 int max=0;
 int min=999;
 int max1=0;
 int min1=99;
for(int val:myList){
sum+=val;
}
 avg=sum/myList.length;    
 int indext=0;
   for(int val:myList){
       if(val>avg){
       count+=1;
       newList[indext]=val;
       indext++;
       }
   }  
   for(int val: myList){
       if(max<val){
           max=val;
       }
   }
   for(int val:myList){
       if(min>val){
           min=val;
       }
   }
   for(int j=0;j<myList.length;j++){
       if(max1<myList[j]){
           max1=myList[j];
       }
          if(min1>myList[j]){
           min1=myList[j];
       }
   }
 
    
   
        System.out.println(Arrays.toString(myList));
        System.out.println("Sum "+sum);
        System.out.println("Avg "+avg);
        System.out.println("count "+count);
        System.out.println(Arrays.toString(newList));
        System.out.println("Max "+ max);
        System.out.println("Min "+ min);
        System.out.println("Max number "+ max1);
        System.out.println("Min number"+ min1);
        
    }
    
}
