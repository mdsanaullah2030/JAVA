
package testbinary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestBinary {

   
    public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException {
      File f=new File("C:\\Users\\HP\\Desktop\\bainari.dat");
      
        try (FileOutputStream fos = new FileOutputStream(f)) {
            for (int i = 1; i<=100; i++) {
                fos.write(i);
            }
            FileInputStream fis=new FileInputStream(f);
        int value;
        while((value=fis.read())!=-1){
            System.out.println(value);  
        }
        }
      
    }
    
}
