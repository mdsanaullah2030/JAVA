

package teststing;

//import java.util.Scanner;

import java.util.Scanner;

////
//
public class TestSting {

   
    
    public static void main(String[] args) {
    


//        Scanner s=new Scanner(System.in);
//        
//        System.out.println("Enter ur email id ");
//        String userEmail=s.next();
//    
//        String message=String.format("Wlcome %s to Google",userEmail);
//        
//        if(userEmail.equalsIgnoreCase("java")){
//            System.out.println("Enter ur password");
//            String password=s.next();
//            
//            if(password.equals("Java1234")){
//                System.out.println(message);
//            }
//            else{
//                System.out.println("Incorrect Password");
//            }
//            
//        }
//        else{
//            System.out.println("Couldn't find ur Google Account");
//        }
//        
        Scanner inpurt=new Scanner(System.in);
        String message=String.format("Wlcome %s to Google",fasbookName);
        
        System.out.println("Enter the Facebk user name");
      
        String fasbookName=inpurt.next();
          System.out.println("Enter the Facebk Password");
        String Password=inpurt.next();
        if(fasbookName.equalsIgnoreCase("sanaullah")){
        if(Password.equals("150297")){
        
        }
        else{
            System.out.println("Incorrect Password");
        }
        }
        
               
    }
    
}

