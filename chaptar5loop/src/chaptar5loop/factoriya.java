
package chaptar5loop;

import java.util.Scanner;


public class factoriya {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long number=input.nextLong();
      
        for( long i=number;i>=number;i--){
        number *=i;
        }
        System.out.println(number);
    }
}
