
package textabstraction.a;

import test.Car;
import test.Motorcycle;
import test.Vehicle;


public class TextabstractionA {

  
    public static void main(String[] args) {
        Vehicle s=new Car("1234", "sdfsf", 2025);
        s.start();
        s.stop();
        
        Vehicle y=new Motorcycle();
        y.start();
        y.stop();
    }
    
}
