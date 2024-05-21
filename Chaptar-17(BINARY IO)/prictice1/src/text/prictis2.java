
package text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class prictis2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f=new File("D:\\GitHub\\JAVA\\BINARY IO Chaptar17\\baits.dat");
        FileOutputStream v=new FileOutputStream(f);
        for(int i=1;i<=50;i++){
        v.write(i);
        }
        v.close();
        FileInputStream x=new FileInputStream(f);
        int valus;
        while((valus=x.read())!=-1){
            System.out.println(valus);
        }
    }
    
}
