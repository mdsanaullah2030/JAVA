
package avidensbinary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import student.Student;


public class AvidensBinary {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File file=new File("C:\\Users\\HP\\Desktop\\java1.dat");
        Student s=new Student("s", 34);
        Student s1=new Student("sa", 34);
        Student s2=new Student("nu", 34);
        
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
