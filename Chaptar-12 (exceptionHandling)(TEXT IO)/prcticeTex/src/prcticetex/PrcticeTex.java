
package prcticetex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class PrcticeTex {

  
    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File("C:\\Users\\HP\\Desktop\\jee.tex");
        PrintWriter writer=new PrintWriter(file);
        writer.print("Rajshahi");
        writer.append("\nChapainwbgonj");
        writer.append("\nkansat");
        writer.close();
        
        
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        
        }
    }
  
    
}
