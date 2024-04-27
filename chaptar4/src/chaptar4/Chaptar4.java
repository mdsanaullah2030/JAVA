
package chaptar4;

import java.util.Scanner;


public class Chaptar4 {

 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter start point ");
        int startpoint=s.nextInt();
        System.out.println("enter ent point ");
       int endpoint=s.nextInt();
//      
      while(startpoint<=endpoint){
          if(startpoint%3 !=0 || endpoint%5 !=0){
              System.out.println(startpoint);
          }
             
          startpoint++;
      }
       
      }

}
       
    
    

