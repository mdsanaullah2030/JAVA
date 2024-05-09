
package fileClass;

import java.io.File;




public class filemecke {
    public static void main(String[] args) {
        
        File dir=new File("inpurt");
        dir.mkdir();
        File file1=new File("D:/GitHub/JAVA/exceptionHandling/Student.txt");
        File file2=new File("D:/GitHub/JAVA/exceptionHandling/teacher.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("File are created");
        } catch (Exception e) {
            System.out.println(e);
        }
if(file1.exists()){
    System.out.println("File Exists");
}
    }
}
