
package vechicle;

public class Car extends Vechicle{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public String toString() {
        return "Car{" + '}';
    }
    
    

    @Override
    public void start() {
        System.out.println("Car engine started ");  
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle engine started ");
    }
    
}
