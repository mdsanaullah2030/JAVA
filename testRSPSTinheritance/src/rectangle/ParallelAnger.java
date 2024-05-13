
package rectangle;


public class ParallelAnger extends Rectangle{
    private double Floor;
    private double hight;

    public ParallelAnger() {
    }

    public ParallelAnger(double Floor, double hight) {
        this.Floor = Floor;
        this.hight = hight;
    }

    public ParallelAnger(double Floor, double hight, double length, double width) {
        super(length, width);
        this.Floor = Floor;
        this.hight = hight;
    }

    public double getFloor() {
        return Floor;
    }

    public void setFloor(double Floor) {
        this.Floor = Floor;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public void@Override
 public void printe()d@Override
 public double printe() {
            System.out.println(Floor*hight);
//        return super.printe(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        return 0;
    }
    
    
}
