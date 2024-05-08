package testobject;

import java.math.BigInteger;
import prme.primeNumber;

public class TestObject {

    public static void main(String[] args) {
        primeNumber s = new primeNumber();
        System.out.println(s.getFactorial());

        primeNumber prime = new primeNumber(5);
        BigInteger factorial = prime.getFactorial();
        System.out.println("Factorial: " + factorial);

        if (prime.isPrime(factorial)) {
            System.out.println("Factorial is a prime number.");
        } else {
            System.out.println("Factorial is not a prime number.");
        }
    }
}
