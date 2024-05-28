
package avidensbinary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import student.Student;


public class AvidensBinaryArray {

  
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File file=new File("C:\\Users\\Admin\\Desktop\\jee.dat");
        Student s=new Student("df", 56);
        Student s1=new Student("dfd", 56);
        Student s2=new Student("dff", 56);
        
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
        dos.writeUTF(s.toString());
        dos.writeUTF(s1.toString());
        dos.writeUTF(s2.toString());
        dos.close();
        
        DataInputStream dis=new DataInputStream(new FileInputStream(file));
        while(dis.available()>0){  
        System.out.println(dis.readUTF());
       } 
    }
    
}
