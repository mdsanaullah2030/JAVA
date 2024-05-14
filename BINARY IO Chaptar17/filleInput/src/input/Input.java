
package input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Input {
    public static void main(String[] args) throws FileNotFoundException {
      File file=new File("C:\\Users\\HP\\Desktop\\java59.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
          writer.print("Bangladesh");
          writer.append("\nRajshahi");
        }
        
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
