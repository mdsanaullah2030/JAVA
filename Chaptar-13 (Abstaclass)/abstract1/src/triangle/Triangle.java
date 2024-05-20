
package triangle;

public class Triangle extends Geomaetries{
    private int number1;
    private int number2;
    private int number3;

    public Triangle() {
    }

    public Triangle(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public Triangle(int number1, int number2, int number3, String name) {
        super(name);
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    @Override
    public String toString() {
        return "Triangle{" + "number1=" + number1 + ", number2=" + number2 + ", number3=" + number3 + '}';
    }
    
    

    @Override
    public void getAriya() {
        System.out.println("Triangle "+number1+number2+number3);
    }
    
}
