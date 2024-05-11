
package supar_keyword;


public class car extends Vehicle{
    int gear;

    public car() {
    }

    public car(int gear) {
        this.gear = gear;
    }

    public car(int gear, String color, double weigth) {
        super(color, weigth);
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
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
    @Override
    void attribute(){
    super.attribute();
        System.out.println("Gear:"+gear);
    }
}
