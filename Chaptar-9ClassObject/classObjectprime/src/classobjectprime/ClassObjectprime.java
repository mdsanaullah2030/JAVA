
package classobjectprime;

import java.util.Scanner;
import number.testprime;


public class ClassObjectprime {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        testprime index=new testprime(num);
        String masseg=index.checkprime();
        System.out.println(masseg);
    }
    
}
