
package fileinput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileInput {

    public static void main(String[] args) throws FileNotFoundException {
       File file=new File("C:\\Users\\Sanaullah\\Desktop\\java59.txt");
        PrintWriter writer=new PrintWriter(file);{
        writer.print("hello");
        writer.append("n\rahim");
        writer.close();
         }
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){  
        
         System.out.println(scanner.nextLine());
        }
           
        
        
        
    }
    
}
