
package testcreate;

import test.vehicle;


public class turck extends vehicle{

  private int weight;

    public turck() {
    }

    public turck(int weight) {
        this.weight = weight;
    }

    public turck(int weight, int speed, double pregularPrice, String color, double gretSalePrice) {
        super(speed, pregularPrice, color, gretSalePrice);
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    

    @Override
    
    public double getPregularPrice() {
            if (this.weight > 2000) {

            return super.getPregularPrice() - super.getPregularPrice() * .10;
        } 
        return super.getPregularPrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
  
    
}
