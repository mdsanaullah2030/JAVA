
package faile.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Faile1 {

   
    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File("C:\\Users\\Admin\\Desktop\\jee");
        PrintWriter writer=new PrintWriter(file);
        writer.append("hello isdb");
        writer.close();
        
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
    
}
