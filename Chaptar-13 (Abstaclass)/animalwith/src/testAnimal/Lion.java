
package testAnimal;


public class Lion extends testAnimal{

    public Lion() {
    }

    public Lion(String df) {
        super(df);
    }

    @Override
    public void sound() {
        
        System.out.println("Lion "+"roars");
    }
    
}
