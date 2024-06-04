
package recursionrando;

import java.util.Scanner;

public class RecursionRando {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        System.out.println(fac(input));
 
    }
          static int fac(int n){
    if(n==0 || n==1){
    return 1;
    }
    else{
    return n*fac(n-1);
    }
    }
}
