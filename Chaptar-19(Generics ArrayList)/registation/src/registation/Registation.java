
package registation;

import text.Student;


public class Registation {

    public static void main(String[] args) {
        Student<String,Integer,String> s=new Student<>("sanaullah",1234, "sanaullah@gmail.com");
        System.out.println(s);
    }
    
}
