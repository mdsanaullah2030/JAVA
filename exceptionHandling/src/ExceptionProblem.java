
import java.util.Scanner;


public class ExceptionProblem {
    public static void main(String[] args) {
        int count=1;
   do{
        try {
                 Scanner input=new Scanner(System.in);
        System.out.println("Please Enter number");
        int number1=input.nextInt();
         System.out.println("Please Enter number");
        int number2=input.nextInt();
        int result=number1/number2;
        System.out.println("Result:"+number1+"/"+number2+" = "+result);
        count=2;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("You must enter integer.please try again");
        }
   
   }
   while(count==1);
    }
}
