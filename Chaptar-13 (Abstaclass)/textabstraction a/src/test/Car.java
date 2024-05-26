
package test;


public class Car extends Vehicle{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle engine started");  
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle engine Stop");
    }
    
}
