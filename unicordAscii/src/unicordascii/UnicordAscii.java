
import java.util.Scanner;

public class UnicordAscii {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float number=s.nextFloat();
        char ch = 'b';
        int letter = (int) (Math.random()*number); 
        ch += letter; 
        System.out.println(ch); 
    }
}
