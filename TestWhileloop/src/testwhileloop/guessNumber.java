
package testwhileloop;

import java.util.Scanner;



public class guessNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int guess=input.nextInt();
        int number=(int) (Math.random()*100);
        if (number==guess){
            System.out.println("Yes the Guess number"+ number );
        }
        else{
            System.out.println("no the Guess number");
        }
    }
    
}
