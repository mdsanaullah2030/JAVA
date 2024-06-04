
package filetex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileTex {

   
    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File("C:\\Users\\Admin\\Desktop\\j59.text");
        PrintWriter writer=new PrintWriter(file);
        writer.print("sanaullah");
        writer.append("\nKutub");
        writer.close();
        
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
    
}
