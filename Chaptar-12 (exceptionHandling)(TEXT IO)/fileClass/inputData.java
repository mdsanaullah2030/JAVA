
package fileClass;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class inputData {
    public static void main(String[] args) throws FileNotFoundException {
        String id,name;
        try {
            
            Formatter formatter=new Formatter("D:/GitHub/JAVA/Student.txt");
            Scanner input=new Scanner(System.in);
            System.out.println("How many student:");
            int number=input.nextInt();
            for(int i=1;i<=number;i++){
                System.out.println("Enter student id and name");
                id=input.next();
                name=input.next();
                formatter.format("%s %s\r\n",id,name);
            }
            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
