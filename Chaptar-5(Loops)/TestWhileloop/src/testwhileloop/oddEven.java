
package testwhileloop;

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Please Enter 1st number");
        int userNumber1=number.nextInt();
        System.out.println("Please Enter 2st number");
        int userNumber2=number.nextInt();
        while(userNumber1<=userNumber2){
        if(userNumber1%2==0){
            System.out.println(userNumber1);
        }
          
           userNumber1++; 
        }
    }
    
}
