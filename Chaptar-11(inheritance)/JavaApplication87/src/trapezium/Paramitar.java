
package trapezium;


public class Paramitar extends Mathords{

    public Paramitar() {
    }

    public Paramitar(int length, int width, int radius) {
        super(length, width, radius);
    }

    @Override
    public void getAriya() {
        System.out.println("Paramitar "+Math.PI*super.getRadius()*super.getRadius());
    }
    
  
}
