
package testwhileloop;

import java.util.Scanner;

public class sumWhileloop {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        int add=number.nextInt();
        int sum=0,i=1;
        while(i<add){
    sum=sum+i;
    i++;
    }
        System.out.println(sum);
        
    }
    
}
