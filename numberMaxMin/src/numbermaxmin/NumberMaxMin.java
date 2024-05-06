
package numbermaxmin;
import MaxMin.textMax;
import java.util.Random;

public class NumberMaxMin {

  
    public static void main(String[] args) {
        textMax add=new textMax();
           Random random=new Random();
         
     add.number1=random.nextInt(30)+1;
     add.number2=random.nextInt(30)+1;
     add.number3=random.nextInt(30)+1;
     
        System.out.println("MAX");
        System.out.println(add.finemax());
        System.out.println("MIN");
        System.out.println(add.minNumber());
    }
    
}
