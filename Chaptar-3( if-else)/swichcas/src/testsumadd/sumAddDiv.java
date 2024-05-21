package testsumadd;

public class testsumadd {
    public int num1;
    public int num2;

    // Constructor
    public testsumadd(int num1, int num2) {
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
           
               
        }
    }
}
   
