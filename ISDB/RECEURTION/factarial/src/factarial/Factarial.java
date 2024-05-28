
package factarial;

import java.util.Scanner;


public class Factarial {

  
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(fac(number));
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
