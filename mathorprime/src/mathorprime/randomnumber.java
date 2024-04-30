package mathorprime;

import java.util.Random;

public class randomnumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(26);
        char randomChar = (char) ('a' + randomNumber);

        System.out.println("Random character: " + randomChar);
    
    }
}
