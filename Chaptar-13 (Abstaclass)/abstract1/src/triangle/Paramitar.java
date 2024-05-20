
package triangle;


public class Paramitar extends Geomaetries{
    private int radius;

    public Paramitar() {
    }

    public Paramitar(int radius) {
        this.radius = radius;
    }

    public Paramitar(int radius, String name) {
        super(name);
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
        return "Paramitar{" + "radius=" + radius + '}';
    }
    

    @Override
    public void getAriya() {
        System.out.println("Paramitar "+Math.PI*radius*radius);
    }
    
}
