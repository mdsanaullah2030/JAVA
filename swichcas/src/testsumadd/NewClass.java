

package prme;

import java.math.BigInteger;

public class primeNumber {
    private int number;

    public primeNumber() {
        this.number = 2; 
    }

    public primeNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number <= 1) {
            return false; 
        }

        
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        primeNumber prime = new primeNumber(17); 
        if (prime.isPrime()) {
            System.out.println(prime.number + " is a prime number.");
        } else {
            System.out.println(prime.number + " is not a prime number.");
        }
    }
}
