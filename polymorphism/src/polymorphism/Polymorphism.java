
package polymorphism;

import java.util.ArrayList;
import test.student;
import java.util.List;
public class Polymorphism {

 
    public static void main(String[] args) {
       
        
        student sanaullah=new student("sanaullah", 12345, true);
        student samiullah=new student("samiullah", 13234, true);
        student sifaullah=new student("sifaullah",2334, true);
        student hamidullah=new student("hamidullah", 23455, true);
        
        
        List<student> inpurt=new ArrayList<>();
        inpurt.add(sifaullah);
        inpurt.add(samiullah);
        inpurt.add(sanaullah);
        inpurt.add(hamidullah);
        
        for(student s:inpurt){
            System.out.println(s);
        }
    }
    
}
