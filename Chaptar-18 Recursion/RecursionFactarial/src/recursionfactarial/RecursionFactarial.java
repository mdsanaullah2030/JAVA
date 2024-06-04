
package recursionfactarial;

import java.util.Scanner;

public class RecursionFactarial {

    public static void main(String[] args) {
        System.out.println("Plase Enter number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println("Factarial Number "+factarial(number));
        
    }
    static  int factarial(int n){
    if(n==0 | n==1){
    return 1;
    }
    else{
    return n*factarial(n-1);
    
    }
    }
    
}
