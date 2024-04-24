
package leapyersruel;

import java.util.Scanner;


public class Leapyersruel {

    public static void main(String[] args) {
       
        Scanner Scanner=new Scanner(System.in);
        System.out.println("please Enter Year");
        
        int year=Scanner.nextInt();
        boolean isleapYear=(year%4==0); 
//         boolean isleapYear=(year%4==0 && year%100 !=0)||(year%400==0);
         System.out.println("Leap yers ");
         System.out.println(isleapYear);
                
    }
    
}
