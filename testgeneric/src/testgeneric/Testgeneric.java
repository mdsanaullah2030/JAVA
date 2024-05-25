
package testgeneric;

import java.util.ArrayList;
import teacher.Teachere;


public class Testgeneric {

  
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("sanaullah");
        name.add("sifaullah");
        name.add("Raju");
        name.add("Kutub");
        
        System.out.println(name);
        ArrayList<Integer> number=new ArrayList<>();
        number.add(123);
        number.add(6478);
        number.add(3487);
        number.add(4572);
        System.out.println(number);
        
        ArrayList<Teachere> sdf=new ArrayList<Teachere>();
        System.out.println(sdf);
                
        
    }
    
}
