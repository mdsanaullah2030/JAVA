
package test;

public class vehicle {
    private int speed;
    private  double pregularPrice;
    private String color;
   

    public vehicle() {
    }

    public vehicle(int speed, double pregularPrice, String color, double gretSalePrice) {
        this.speed = speed;
        this.pregularPrice = pregularPrice;
        this.color = color;
       
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPregularPrice() {
        return pregularPrice;
    }

    public void setPregularPrice(double pregularPrice) {
        this.pregularPrice = pregularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



   public double getSalePrice(){
    
        return  this.pregularPrice;
    }
    
 
         
}
