package trapezium;

public class Trapezium extends Mathords {
    private int num1;
    private int num2;

    public Trapezium() {
    }

    public Trapezium(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Trapezium(int num1, int num2, int length, int width, int radius) {
        super(length, width, radius);
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public void getAriya() {
     
//        double area = ;
        System.out.println("Trapezium "+0.5 * (num1 + num2) * super.getLength());
    }
}
