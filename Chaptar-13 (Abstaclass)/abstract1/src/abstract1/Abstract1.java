
package abstract1;

import triangle.Geomaetries;
import triangle.ParallelAnger;
import triangle.Rectangle;
import triangle.Triangle;

public class Abstract1 {

   
    public static void main(String[] args) {
        Geomaetries x=new ParallelAnger(180, 90, "land");
        x.getAriya();
        
        Geomaetries y=new Rectangle(60, 100);
        y.getAriya();
        
        Geomaetries z=new ParallelAnger(30, 50);
        z.getAriya();
        
       Geomaetries a=new Triangle(40, 50, 60);
       a.getAriya();
        
        
    }
    
}
