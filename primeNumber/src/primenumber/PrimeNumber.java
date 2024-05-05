
package primenumber;

import java.util.Scanner;


public class PrimeNumber {

 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int i=0;
        for(i=1; i<number; i++){
              if (number%i==0) {
                i++;
            }
        }
                 if (i==2) {
            System.out.println("it is a prime number");
        }
        else{
        System.out.println("it is not a prime number");
         }
        }
    }
    

