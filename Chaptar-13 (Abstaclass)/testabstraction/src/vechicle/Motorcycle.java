
package vechicle;


public class Motorcycle extends Vechicle{

    public Motorcycle() {
    }

    public Motorcycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }
    
    

    @Override
    public void start() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopped ");
    }
    
}
