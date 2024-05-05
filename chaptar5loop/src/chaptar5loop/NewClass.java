
package chaptar5loop;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Please Enter number");
        int input=n.nextInt();
        int sum=0,i=1;
        while(i<input){
        sum=sum+i;
        i++;
        }
        System.out.println("Total number");
        System.out.println(sum);
    }
}
