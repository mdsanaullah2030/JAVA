
package textFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class JavaApplication64 {

 
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("\\GitHub\\JAVA\\sana.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("MD:SANULLAH");
             writer.close();
        }
        Scanner scanner=new Scanner(file);
        System.out.println(scanner.next());
    }
}
