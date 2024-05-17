
package test;


public class Parallel extends Rectangle{
private double hight;

    public Parallel() {
    }

    public Parallel(double hight) {
        this.hight = hight;
    }

    public Parallel(double hight, double radius, double width, double length) {
        super(radius, width, length);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public void getArea() {
        
        System.out.println(super.getLength()*hight);
    }

    


    }

    

