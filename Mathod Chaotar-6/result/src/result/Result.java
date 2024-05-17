
package result;

import java.util.Scanner;


public class Result {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter number: ");
        int mark=scanner.nextInt();
        
        if(mark<=32){
            System.out.println("F");
        }
        else if(mark<=39){
            System.out.println("D");
        }
          else if(mark<=49){
            System.out.println("C");
        }
          else if(mark<=59){
            System.out.println("B");
        }
          else if(mark<=69){
            System.out.println("A-");
        }
          else if(mark<=79){
            System.out.println("A");
        }
          else if(mark<=80){
            System.out.println("A+");
        }
        
        

    }
    
}
