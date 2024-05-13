
package geomatry;


public class Rectangle extends GeoMatryObject{
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+width);
    }
    
    
}
