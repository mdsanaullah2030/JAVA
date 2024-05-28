
package recursion;

import java.util.Scanner;
import test.Factarial;

public class Recursion {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        Factarial input=new Factarial(number);
        System.out.println(input.fac(number));
    }
    
}
