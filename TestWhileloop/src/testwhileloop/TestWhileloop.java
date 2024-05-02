
package testwhileloop;

import java.util.Scanner;


public class TestWhileloop {


    public static void main(String[] args) {
    
        
        Scanner inpurt=new Scanner(System.in);
        System.out.println("Please inter number");
        int stratPoint=inpurt.nextInt();
        System.out.println("Please Enter number");
        int entPoint=inpurt.nextInt();
        while(stratPoint<=entPoint){
            if(stratPoint%3 !=0 || stratPoint%5 !=0){
                
                System.out.println(stratPoint);
            }
            
            
        stratPoint++;
        }
    }
    
}
