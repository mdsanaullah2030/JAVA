
package teacher;

import test.Registation;
import test.Student;


public class Teacher {

  
    public static void main(String[] args) {
        Student<String,Integer,String>part1=new Student<String,Integer,String>("MD:SANAULLAH",13234234,"sanaullah@gmail.com");
        Student<String,Integer,String>part2=new Student<String,Integer,String>("MD:SAMIULLAH",13234234,"samiullah@gmail.com");
        Student<String,Integer,String>part3=new Student<String,Integer,String>("MD:HAMIDULLAH",13234234,"hamidullah@gmail.com");
      
        Student<String,Integer,String>part4=new Student<String,Integer,String>("MD:OBAIDULLAH",13234234,"obaidullah@gmail.com");
        
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);
        System.out.println(part4);
        
        Registation r=new Registation();
        r.delete(part3);
        r.save(part4);
    }
    
}
