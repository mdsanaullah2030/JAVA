
package alltest;

import java.util.Scanner;


public class switct {
    public static void main(String[] args) {
        Scanner inpurt=new Scanner(System.in);
        int enter=inpurt.nextInt();
        String number="";
        switch(enter){
        case 1:
            number="SANAULLAH";
            break;
        case 2:
            number="SAMIULLAH";
            break;
        case 3:
            number="SIFAULLAH";
            break;
        case 4:
            number="HAMIDULLAH";
            break;
        case 5:
            number="OBAIDULLAH";
            break;
        case 6:
            number="MOSTAFIZUR";
            break;
            
              case 7:
            number="Invalid number";
            break;
            
            
            
        }
        System.out.println(number);
    }
}
