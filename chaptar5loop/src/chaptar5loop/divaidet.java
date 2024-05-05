
package chaptar5loop;

import java.util.Scanner;


public class divaidet {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter number");
        int Strat=input.nextInt();
        System.out.println("Please Enter Number");
        int end=input.nextInt();
     
        while(Strat<=end){
            if(Strat%3 !=0 || Strat%5 !=0){
                System.out.println(Strat); 
            }
            Strat++;
        }
    }
}
