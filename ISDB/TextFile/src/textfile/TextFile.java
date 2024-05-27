
package textfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class TextFile {

   
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\HP\\Desktop\\jee123.text");
        PrintWriter s=new PrintWriter(file);
        s.print("SANAULLAH");
        s.append("\nSIFAULLAH");
        s.append("\nSAMIULLAH");
        s.append("\nHAMIDULLAH");
        s.append("\nOBAIDULLAH");
        s.close();
        
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
    
}
