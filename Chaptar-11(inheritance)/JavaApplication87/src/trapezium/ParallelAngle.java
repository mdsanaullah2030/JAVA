
package trapezium;


public class ParallelAngle extends Mathords{
  private int hight;

    public ParallelAngle() {
    }

    public ParallelAngle(int hight) {
        this.hight = hight;
    }

    public ParallelAngle(int hight, int length, int width, int radius) {
        super(length, width, radius);
        this.hight = hight;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public void getAriya() {
        System.out.println("ParallelAngle "+super.getLength()*hight);
    }
  
}
