
package paramiter;


public class RectangelBorder extends Paramiter{
private int lenght;
private int width;

    public RectangelBorder() {
    }

    public RectangelBorder(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public RectangelBorder(int lenght, int width, String color) {
        super(color);
        this.lenght = lenght;
        this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "RectangelBorder{" + "lenght=" + lenght + ", width=" + width + '}';
    }

    @Override
    public void getArriya() {
        System.out.println(2*(lenght*width));
    }
    
}
