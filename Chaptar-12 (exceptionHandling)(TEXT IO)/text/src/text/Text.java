
package text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Text {

  
    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File("C:\\Users\\HP\\Desktop\\java12.text");
        PrintWriter writer=new PrintWriter((file));
        writer.print("hasan");
        writer.append("\nsofik");
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
    
}
