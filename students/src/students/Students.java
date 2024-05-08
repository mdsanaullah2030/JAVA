
package students;


import java.util.ArrayList;
import java.util.List;
import registation.StudentAddres;


public class Students {

   
    public static void main(String[] args) {
      StudentAddres nusrat=new StudentAddres("nusrat ","12345","nusrat@gmail.com",true);
      StudentAddres Tawhid=new StudentAddres("Tawhid ","12345","Tawhid@gmail.com",true);
      StudentAddres Kutub=new StudentAddres("Kutub ","12345","Kutub@gmail.com",true);
      StudentAddres Nasrin=new StudentAddres("Nasrin ","12345","Nasrin@gmail.com",true);
      StudentAddres Najmul=new StudentAddres("Najmul ","12345","Najmul@gmail.com",true);
      StudentAddres Raju=new StudentAddres("Raju ","12345","Raju@gmail.com",true);
      StudentAddres Rafiqul=new StudentAddres("Rafiqul ","12345","Rafiqul@gmail.com",true);
      StudentAddres Rijby=new StudentAddres("Rijby ","12345","Rijby@gmail.com",true);
      StudentAddres Shabab=new StudentAddres("Shabab ","12345","Shabab@gmail.com",true);
      StudentAddres Naymul=new StudentAddres("Naymul ","12345","Naymul@gmail.com",true);
      StudentAddres Sanaullah=new StudentAddres("Sanaullah ","12345","Sanaullah@gmail.com",true);
      StudentAddres Aminul=new StudentAddres("Aminul ","12345","Aminul@gmail.com",true);
      StudentAddres Rabiul=new StudentAddres("Rabiul ","12345","Rabiul@gmail.com",true);
      StudentAddres Nirjas=new StudentAddres("Nirjas ","12345","Nirjas@gmail.com",true);
      
      
        List<StudentAddres> student=new ArrayList<>();
        
        student.add(nusrat);
        student.add(Tawhid);
        student.add(Kutub);
        student.add(Nasrin);
        student.add(Raju);
        student.add(Rafiqul);
        student.add(Rijby);
        student.add(Shabab);
        student.add(Naymul);
        student.add(Sanaullah);
        student.add(Aminul);
        student.add(Rabiul);
        student.add(Nirjas);
        student.add(Najmul);
       
        for (StudentAddres s:student){
            System.out.println(s);
        }
               
    }
    
}
