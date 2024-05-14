
package testInteritance;

import vehicle.Truck;


public class TestException {

    
    public static void main(String[] args) {
        Truck truck=new Truck(3000, 250, 5000, "black");
        System.out.println(truck.getSalePrice());
    }
    
}
