
package inheritancechaptar11;

import mobale.iohone;
import mobale.sumsung;
import mobale.vivo;


public class InheritanceChaptar11 {

  
    public static void main(String[] args) {
        
        
        sumsung input=new sumsung();
        vivo enter=new vivo(true, true, "color", true, "makeText", "camera", "multimedia");
   
//        input.setMakeclla(true);
//        input.setCamera("50 MPX camera");
//      input.setPlyStore("Yes Use play Story");
//      input.setMakeText("Yes");
//      input.setTucheAble(true);
//      input.setMultimedia("Aoudeo Stores");
              
      
        enter.printDetails();
    }
    
}
