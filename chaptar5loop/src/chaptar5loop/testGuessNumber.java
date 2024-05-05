
package chaptar5loop;

import java.util.Scanner;


public class testGuessNumber {
    public static void main(String[] args) {
        int number=(int)Math.random()*100;
        System.out.println("Please Enter Guess Number");
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        if(number==input){
            System.out.println("yes the number "+number );
            
        }
        else if(input>number){
        System.out.println("your guess to hight");
   }
        else{
          System.out.println("your guess to lpw");
        }
    }
    
}
