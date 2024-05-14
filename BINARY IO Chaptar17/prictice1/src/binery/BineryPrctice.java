
package binery;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BineryPrctice {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException {
       File f=new File("D:\\GitHub\\JAVA\\BINARY IO Chaptar17\\bit.dat");
        FileOutputStream write=new FileOutputStream(f);
        for(int i=1;i<=100;i++){
        write.write(i);
        
        }
        write.close();
        
        FileInputStream fis=new FileInputStream(f);
        int value;
        while((value=fis.read())!=-1){  
        System.out.println(value);
        }
    }
}
