
package avidence;

<<<<<<< HEAD

public class Avidence {

    
    public static void main(String[] args) {
      
    }
    
=======
//import java.util.Scanner;

import java.util.Scanner;



public class Avidence {

   
    public static void main(String[] args) {
        
  
        Scanner scanner=new Scanner(System.in);
       
         int total = 0;
        
        while (true) {
            System.out.print("Enter an integer (or a negative integer to stop): ");
            int number = scanner.nextInt();
            if (number <=0) {
                break;
            }
            total += number;
                   
        }
        
        System.out.println("The sum of positive integers is: " + total);
        scanner.close();
    }
>>>>>>> 31c1b8f2e70def88cb132eef621c090ec209dc4a
}
