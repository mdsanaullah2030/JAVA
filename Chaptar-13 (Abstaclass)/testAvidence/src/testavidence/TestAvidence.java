
package testavidence;

import test.Car;
import test.Motorcycle;
import test.Vehicle;


public class TestAvidence {


    public static void main(String[] args) {
        Vehicle s=new Car("123", "FZS", 2030);
        s.stop();
        s.start();
        
        
        Vehicle p=new Motorcycle("1245", "FZS", 2030);
        p.start();
        p.stop();
        
    }
    
}
