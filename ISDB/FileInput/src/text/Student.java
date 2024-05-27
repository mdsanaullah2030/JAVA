
package text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Student {
  

File file=new File("C:\\Users\\HP\\Desktop\\javajee.taxt");
    
    public void getWrite() throws FileNotFoundException{
        
        PrintWriter writer=new PrintWriter(file);
       writer.append("Hello Bangladesh");
       writer.print("\nHello Rajshahi");
       writer.close();
        
       
       
    }
    public  void getRead() throws FileNotFoundException{
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
