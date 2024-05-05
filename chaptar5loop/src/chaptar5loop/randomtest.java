
package chaptar5loop;

import java.util.Random;
import java.util.Scanner;

public class randomtest {
    public static void main(String[] args) {
        Random input=new Random();
        int index=input.nextInt();
        Scanner push=new Scanner(System.in);
        int add=push.nextInt();
        while(index<=add){
        if(index%2 !=0){
            System.out.println(add);
        }
        add++;
        }
    }
}
