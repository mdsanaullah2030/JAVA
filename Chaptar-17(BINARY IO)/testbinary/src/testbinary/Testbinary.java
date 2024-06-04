
package testbinary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import text.Student;


public class Testbinary {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file=new File("C:\\Users\\Admin\\Desktop\\avidence.dat");
        Student s=new Student("sanaullah", 27);
        Student s1=new Student("Kutub", 26);
//        
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
        dos.writeUTF(s.toString());
        dos.writeUTF(s1.toString());
        dos.close();
        
        DataInputStream dis=new DataInputStream(new FileInputStream (file));
        while(dis.available()>0){
            System.out.println(dis.readUTF());
        }
        
    }
    
}
