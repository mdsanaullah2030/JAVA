
package generic;

import text.Student;

public class Generic {

    public static void main(String[] args) {
        
        Student<String,String,Integer> number=new Student<>("sanaullah", "sanaullah@gmail.com", 12345);
        System.out.println(number);
    }
    
}
