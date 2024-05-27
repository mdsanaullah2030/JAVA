
package javaapplication21;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import text.Student;


public class JavaApplication21 {

  
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Student s1=new Student("sanaullah", 26);
//        Student s2=new Student("sifaullah", 18);
//        Student s3=new Student("samiullah", 10);
        
        File file=new File("C:\\Users\\HP\\Desktop\\qasfg.dat");
        DataOutputStream s=new DataOutputStream(new FileOutputStream(file));
        s.writeUTF(s1.getName()+s1.getAge());
        s.close();
    }
    
}
