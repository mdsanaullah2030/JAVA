
package testAnimal;


public class Tiger extends testAnimal{

    public Tiger() {
    }

    public Tiger(String df) {
        super(df);
    }
    

    @Override
    public void sound() {
        System.out.println("Tiger "+"growls");   
    }
    
}
