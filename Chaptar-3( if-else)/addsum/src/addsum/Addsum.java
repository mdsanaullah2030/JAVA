package addsum;

public class Addsum {

    public int num1;
    public int num2;

    // Constructor
    public Addsum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to perform arithmetic operations
    public int calculate(int operation) {
        switch (operation) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    public static void main(String[] args) {
        Addsum addsum = new Addsum(10, 5);
        
        System.out.println("Addition: " + addsum.calculate(1));
        System.out.println("Subtraction: " + addsum.calculate(2));
        System.out.println("Multiplication: " + addsum.calculate(3));
        System.out.println("Division: " + addsum.calculate(4));
    }
}
