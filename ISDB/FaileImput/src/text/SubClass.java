
package text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SubClass {
    File file=new File("C:\\Users\\HP\\Desktop\\java1.text");
    public void getWrite() throws FileNotFoundException{
        PrintWriter writer=new PrintWriter(file);
        writer.append("sanaullah");
        writer.print("n\sifaullah");
        writer.close();
    }
    public void getRide() throws FileNotFoundException{
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
