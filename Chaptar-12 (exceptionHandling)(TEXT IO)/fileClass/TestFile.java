
package fileClass;

import java.io.File;


public class TestFile {
    public static void main(String[] args) {
       File dir=new File("C:/Users/HP/Desktop/partion");
    dir.mkdir();
        System.out.println(dir.getName());
        
//        if(dir.delete()){
//           System.out.println("folder has been delete");  
//        }
       
        
    }
    
    
}
