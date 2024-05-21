
package avidence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Avidence {

   
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\HP\\Desktop\\java");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("sff");
        }
      Scanner scanner=new Scanner(file);
        System.out.println(scanner.nextInt());
    }
    
}
