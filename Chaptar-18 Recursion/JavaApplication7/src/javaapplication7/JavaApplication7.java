
package javaapplication7;

import java.util.Scanner;
import test.Subclass;

public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int fac=scanner.nextInt();
        
        Subclass s=new Subclass(fac);
        System.out.println(s.factarial(fac));
    }
    
}
