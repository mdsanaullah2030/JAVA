
package marck;

import java.util.Scanner;


public class Marck {

 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter theory Marks:");
        int theory_marks=scanner.nextInt(); 
        System.out.println("Please Entar Prctical Marck:");
        int Practical_marks=scanner.nextInt();
        System.out.println("Avarege Marck "+(theory_marks+Practical_marks)/2+"%");
    
}
}