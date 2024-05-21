package arrays;

import java.util.Random;

public class maxmin {

    public static void main(String[] args) {

        int[] myArray = new int[50];
        Random random = new Random();
        int sum = 0;
        int max = 0;
        int avg=0;
        int num = random.nextInt(40);
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = num;

            for (int val : myArray) {
                sum += val;

            }

        }

        for (int j = 0; j < myArray.length; j++) {
            if (max < myArray[j]) {
                max = myArray[j];
            }
        }
     avg=sum/num;
        System.out.println("SUM "+sum);
        System.out.println("MAX "+max);
        System.out.println("AVG "+avg);
    }

}
