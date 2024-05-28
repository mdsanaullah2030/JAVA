
package testtex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class TestTex {

  
    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File("C:\\Users\\HP\\Desktop\\java.text");
        PrintWriter writer=new PrintWriter(file);{
    writer.print("rumi");
    writer.append("n\rahim");
    writer.close();
    }
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){ 
        System.out.println(scanner.nextLine());
    }
   } 
}
