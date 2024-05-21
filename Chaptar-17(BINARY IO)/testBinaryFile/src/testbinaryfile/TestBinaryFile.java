
package testbinaryfile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import student.Student;

public class TestBinaryFile {

 
    public static void main(String[] args) throws FileNotFoundException, IOException {
                File file=new File("C:\\Users\\HP\\Desktop\\java5.dat");

       Student s=new Student("sanaullah", 27);
       Student s1=new Student("sifaullah", 18);
       Student s2=new Student("samiullah", 10);
       
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
