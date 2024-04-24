
package fahrenheittocelsius;

//import java.util.Scanner;

import java.util.Scanner;


public class FahrenheitToCelsius {


    public static void main(String[] args) {
        Scanner inpurt=new Scanner(System.in);
        System.out.println("please inter  Fahrenheit number");
        float fertemp=inpurt.nextFloat();
        double result=((fertemp-32)/9)*5;
        System.out.println(result);


    }
    
}
