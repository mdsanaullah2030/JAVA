package dalyincame;

//import java.util.Scanner;
import java.util.Scanner;

//import java.util.Scanner;
public class Dalyincame {

    public static void main(String[] args) {
//        Scanner input=new Scanner(System);
//        int dalye=input.nextInt();
//        System.out.println("dalye");
//        System.out.println(dalye);
//        int weekly=input.nextInt();
//        System.out.println("weekly");
//        System.out.println(weekly);

//    Scanner Scanner=new Scanner(System.in);
//    int maxNumber;
//        System.out.println("pls firstNumber");
//    int firstNumber=Scanner.nextInt();
//        System.out.println("pls secntNumber ");
//    int secntNumber=Scanner.nextInt();
//        System.out.println("thredNumber");
//    int thredNumber=Scanner.nextInt();
//   
//    if(firstNumber>secntNumber & firstNumber>thredNumber){
//    maxNumber=firstNumber;
//}
//    
//    else if(secntNumber>firstNumber & secntNumber>thredNumber){
//    
//    maxNumber=secntNumber;
//}
//    maxNumber=thredNumber;
//
//        System.out.println(maxNumber);  
        Scanner input = new Scanner(System.in);
        int mark = input.nextInt();

        if (mark <=32) {
            System.out.println("F");
        } 
       else if (mark <=39) {
            System.out.println("D");
        }
         else if (mark <=49) {
            System.out.println("C");
        }
         else if (mark <=59) {
            System.out.println("B");
        }
         else if (mark <=69) {
            System.out.println("A-");
        }
           else if (mark <=79) {
            System.out.println("A");
        }
            else if (mark <=80) {
            System.out.println("A+");
        }

    }

}
