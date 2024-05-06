
package chaptar5loop;

import java.util.Scanner;


public class repeantsum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);
        System.out.println(number1+number2);
        int answer=input.nextInt();
        while(number1+number2 !=answer){
            System.out.println("Wrong number.Try Again . What is this"+number1+number1+"?");
            answer=input.nextInt();
        }
        System.out.println("You got it !");
    }
}
