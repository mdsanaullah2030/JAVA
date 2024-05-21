
package filleinput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FilleInput {

  
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\HP\\Desktop\\jee");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("Today is oourEvidencw Exam at 5.00 PM");
            writer.append("\nBangladesh is a best county");
        }
        
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        
    }
    
}
