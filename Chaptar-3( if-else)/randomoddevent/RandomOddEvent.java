
package randomoddevent;

import java.util.Scanner;


public class RandomOddEvent {

   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number%2==0){
            System.out.println("Evend "+number);
        }
        else{
                   System.out.println("Odd"); 

        }
        }
    }
    

