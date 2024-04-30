import java.util.Scanner;

public class Mathorprime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = s.nextInt();
        
        boolean result = isPrime(number);

        if (result) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }

    public static boolean isPrime(int number) {
     
        int count=0;     
             
        for (int i = 1; i <=number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count==2){ 
        return true;
        
        }
        else{
        return false;
        }
    }
}
