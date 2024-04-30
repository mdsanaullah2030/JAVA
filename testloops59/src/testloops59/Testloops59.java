
package testloops59;

import java.util.Scanner;

public class Testloops59 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.println("Enter value");
            
            int usreInpurt=s.nextInt();
            sum+=usreInpurt;
            
            if(sum>=200){
            
            }
            else if(sum>=100){
            continue;
            }
            System.out.println("sum is "+sum);
                
            
        }
    }
    
}
