
package positivenegative;

import java.util.Scanner;


public class PositiveNegative {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please Enter Number");
        int number=scanner.nextInt();
        if(number>0){
            System.out.println("positive number");
        }
        else if(number<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("Number is zero");
        } 
    }
  
}
