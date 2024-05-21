
package switchcase;

import java.util.Scanner;


public class Switchcase {


    public static void main(String[] args) {
     
        Scanner Scanner=new Scanner(System.in);
        int numberofday=Scanner.nextInt();
        System.out.println("inter please case name");
        String dayName="";
        
        switch(numberofday){
            case 1:
                dayName="Sturday";
                break;
       
 
                 case 2:
                dayName="Sunday";
                break;
                
                 case 3:
                dayName="Monday";
                break;
                
                 case 4:
                dayName="Tustday";
                break;
                
                 case 5:
                dayName="wedsday";
                break;
                
                 case 6:
                dayName="Thestday";
                break;
          case 7:
                dayName="Fryday";
                break;
        }
        System.out.println(dayName);
    }
    
}
