
package maxmin;

import java.util.Scanner;


public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter 1st number");
        int number1=scanner.nextInt();
        System.out.println("Please Enter 2nt  number");
        int number2=scanner.nextInt();
        System.out.println("Please Enter 3rd number");
        int number3=scanner.nextInt();
        int max=0;
        int min=0;
        if(number1>number2 && number1>number3){
        max=number1;
        }
        else if(number2>number1 && number2>number3){
        max=number2;
        }
        else{
        max=number3;
        }
        
           if(number1<number2 && number1<number3){
        max=number1;
        }
        else if(number2<number1 && number2<number3){
        max=number2;
        }
        else{
        min=number3;
        }
        System.out.println("Max number "+max);
        System.out.println("Min number "+min);
                
    }
}
