
package vehicle;


public class Truck extends Vehicle{
   private int weight; 

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" + "weight=" + weight + '}';
    }

    @Override
    public double getSelaPrice() {
        
        if(this.weight>2000){   
        return (super.getRegularPrice()-(getRegularPrice()*.10));
        } 
        
        
        else{
        return super.getSelaPrice();
        }
    }
    
    
   
   
}
