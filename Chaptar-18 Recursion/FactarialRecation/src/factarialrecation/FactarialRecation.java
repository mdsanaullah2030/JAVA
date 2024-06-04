
package factarialrecation;

import java.util.Scanner;
import subclass.Subclass;


public class FactarialRecation {

   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        Subclass input=new Subclass(number);
        System.out.println(input.factarial(number));
        
    }
    
}
