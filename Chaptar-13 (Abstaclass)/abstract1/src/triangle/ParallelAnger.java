
package triangle;


public class ParallelAnger extends Geomaetries{
    
    private int floor;
    private int hight;

    public ParallelAnger() {
    }

    public ParallelAnger(int floor, int hight) {
        this.floor = floor;
        this.hight = hight;
    }

    public ParallelAnger(int floor, int hight, String name) {
        super(name);
        this.floor = floor;
        this.hight = hight;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "ParallelAnger{" + "floor=" + floor + ", hight=" + hight + '}';
    }
    
    

    @Override
    public void getAriya() {
        
        System.out.println("ParallelAnger "+floor*hight);
    }

   
    
    
}
