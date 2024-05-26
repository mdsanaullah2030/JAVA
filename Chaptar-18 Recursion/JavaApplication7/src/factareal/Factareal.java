
package factareal;

import java.util.Scanner;


public class Factareal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(factarial(number));
        
    }
   static int factarial(int n){
    if(n==1){
    return 1;
    }
    else{
    return n*factarial(n-1);
    }
    }
}
