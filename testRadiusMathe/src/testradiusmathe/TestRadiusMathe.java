
package testradiusmathe;

import java.util.Scanner;


public class TestRadiusMathe {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please radius number");
        int radius=scanner.nextInt();
        System.out.println("Please 2nt radiuse number");
        int radius1=scanner.nextInt();
        double PI=3.1416;
        System.out.println("radius"+"*"+"radius1"+"*"+"PI"+"="+radius*radius1*PI);
                
    }
    
}
