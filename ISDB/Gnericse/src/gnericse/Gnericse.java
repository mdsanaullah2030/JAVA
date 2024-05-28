
package gnericse;

import test.Student;


public class Gnericse {

    public static void main(String[] args) {
        Student<String,String,Integer> s=new Student<>("sanaullah", "sanaullah@gmail.com", 27);
        System.out.println(s);
    }
    
}
