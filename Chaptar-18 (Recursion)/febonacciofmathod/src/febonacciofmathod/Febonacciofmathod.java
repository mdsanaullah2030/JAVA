
package febonacciofmathod;

import java.util.Scanner;
import text.Subfebonaccio;


public class Febonacciofmathod {

  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long f=scanner.nextInt();
        Subfebonaccio s=new Subfebonaccio(f);
        System.out.println(s.febonacci(f));
    }
    
}
