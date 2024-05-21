
package arrays;

import java.util.Random;


public class testSum {
    public static void main(String[] args) {
        int [] mylist=new int[50];
        Random random=new Random();
        int num=random.nextInt(50);
        for(int i=0;i<mylist.length;i++){
        mylist[i]=num;
         int sum=0;
        for(int val:mylist){
        sum+=val;
        }
//       
//        sum=+mylist[i];
            System.out.println(sum);
            
        }
    }
}
