
package supar_keyword;


public class Vehicle {
    String color;
    double weigth;

    public Vehicle() {
    }

    public Vehicle(String color, double weigth) {
        this.color = color;
        this.weigth = weigth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
    void attribute(){
        System.out.println("color: "+color);
        System.out.println("weigth: "+weigth);
    }
}
