
package facturial;

import java.util.Scanner;
import text.SubClass;


public class Facturial {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
       SubClass input=new SubClass(number);
        System.out.println(input.factarial(number));
    }
    
}
