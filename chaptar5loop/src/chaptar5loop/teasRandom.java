
package chaptar5loop;

import java.util.Random;


public class teasRandom {
    public static void main(String[] args) {
        Random number=new Random();
        System.out.println("Random number");
        int add=number.nextInt(20);
        int sum=0,i=1;
        while (i<add){
            sum=sum+i;
            i++;
        }
        System.out.println("Total number");
        System.out.println(sum);
    }
    
}
