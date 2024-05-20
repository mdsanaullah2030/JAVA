
package trapezium;


public class Mathords {
    
    private  int length;
    private  int width;
    private  int radius;

    public Mathords() {
    }

    public Mathords(int length, int width, int radius) {
        this.length = length;
        this.width = width;
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Mathords{" + "length=" + length + ", width=" + width + ", radius=" + radius + '}';
    }
    
    public void getAriya(){
        System.out.println("Mathords "+length*width*radius);
    
    }
    
}
