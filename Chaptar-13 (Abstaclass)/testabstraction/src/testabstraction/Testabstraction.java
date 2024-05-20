
package testabstraction;

import vechicle.Car;
import vechicle.Motorcycle;
import vechicle.Vechicle;


public class Testabstraction {

 
    public static void main(String[] args) {
        
       Vechicle s=new Car("sgshd", "sfsdjg",234235);
       s.start();
       s.stop();
        Vechicle t=new Motorcycle();
        t.start();
        t.stop();
    }
    
}
