
package prictice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Prictice1 {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws FileNotFoundException {
       File file=new File("D:\\GitHub\\JAVA\\BINARY IO Chaptar17\\famely.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print("MD:SANAULLAH");
            writer.append("\nMD:HAMIDULLAH");
            writer.append("\nMD:SIFAULLAH");
            writer.append("\nMD:OBAIDULLAH");
            writer.append("\nMD:SAMIULLAH");
            writer.append("\nMD:MOSTAFIZUR");
            writer.append("\nMD:AHMADULLAH");
        }
        
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
        System.out.println(scanner.nextLine());
    }
    
}
}