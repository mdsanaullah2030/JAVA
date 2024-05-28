
import java.util.Scanner;


public class TestTryCatch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Number");
        int number1=scanner.nextInt();
        System.out.println("Please Enter number");
        int number2=scanner.nextInt();
        try {
            System.out.println("Result "+number1/number2);
        } catch (Exception e) {
            System.out.println("number2 can'n by zero");
        }
        System.out.println("Exception continues");
        
        
        
    }
}
