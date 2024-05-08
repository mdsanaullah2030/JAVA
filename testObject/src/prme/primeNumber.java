package prme;

import java.math.BigInteger;

public class primeNumber {

    int number;

    public primeNumber() {
        this.number = 2; 
    }

    public primeNumber(int number) {
        this.number = number;
    }

    public BigInteger getFactorial() {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }

    public boolean isPrime(BigInteger number) {
        if (number.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }

        
        for (BigInteger i = BigInteger.valueOf(2); i.multiply(i).compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
            if (number.mod(i).equals(BigInteger.ZERO)) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        primeNumber prime = new primeNumber(3); 
        BigInteger factorial = prime.getFactorial();
        System.out.println("Factorial: " + factorial);

        if (prime.isPrime(factorial)) {
            System.out.println("Factorial is a prime number.");
        } else {
            System.out.println("Factorial is not a prime number.");
        }
    }
}
