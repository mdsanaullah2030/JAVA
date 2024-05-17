
package text;

import java.util.Arrays;



public class Descending {
    public static void main(String[] args) {
        int []number={12,34,56,32,14};
        Arrays.sort(number);
        for(int i=1;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}