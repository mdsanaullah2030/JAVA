
package number14;

import java.util.Scanner;


public class Number14 {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a letter the grade");
        String letter=s.next();
        
       if(letter.equalsIgnoreCase("A")){
            System.out.println("4");
        }
        else if(letter.equalsIgnoreCase("B")){
            System.out.println("3");
        }
       
        else if(letter.equalsIgnoreCase("C")){
            System.out.println("2");
        }
       
        else if(letter.equalsIgnoreCase("D")){
            System.out.println("1");
        }
       
        else if(letter.equalsIgnoreCase("E")){
            System.out.println("0");
        }
        else{
           System.out.println(letter  +" is a invalid grade");
        }
    }
    
}
