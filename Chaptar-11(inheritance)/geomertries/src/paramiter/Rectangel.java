
package paramiter;


public class Rectangel extends Paramiter{

    private int radius;

    public Rectangel() {
    }

    public Rectangel(int radius) {
        this.radius = radius;
    }

    public Rectangel(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Rectangel{" + "radius=" + radius + '}';
    }

    @Override
    public void getArriya() {
        System.out.println(Math.PI*radius*radius);
    }
    
    
 

   
   
    

}