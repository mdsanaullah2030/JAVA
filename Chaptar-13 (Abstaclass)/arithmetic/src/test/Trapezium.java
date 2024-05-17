
package test;


public class Trapezium extends Rectangle{
private Integer number1,number2,number3;

    public Trapezium() {
    }

    public Trapezium(Integer number1, Integer number2, Integer number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public Trapezium(Integer number1, Integer number2, Integer number3, double radius, double width, double length) {
        super(radius, width, length);
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Integer getNumber3() {
        return number3;
    }

    public void setNumber3(Integer number3) {
        this.number3 = number3;
    }


    @Override
    public void getArea() {
        System.out.println (0.5*number1*number2*number3);
    }




    
}
