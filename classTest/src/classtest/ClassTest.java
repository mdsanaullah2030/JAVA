
package classtest;

import java.util.Random;
import somadd.doSum;


public class ClassTest {

  
    public static void main(String[] args) {
      doSum add=new doSum();
        Random  random=new Random();
        
         add.number1=random.nextInt(30);
     add.number2=random.nextInt(30);
     add.number3=random.nextInt(30);
     
        System.out.println(add.sum());
        System.out.println(add.multiplicatin());
        System.out.println(add.subtraction());
    }
    
}
