
package testabstractclass;

import geomatry.Circle;
import geomatry.GeoMatryObject;
import geomatry.Rectangle;


public class Testabstractclass {

 
    public static void main(String[] args) {
                GeoMatryObject circle = new Circle(5);

        GeoMatryObject rectangle = new Rectangle(2, 2);

        circle.setColor("Black");

        displayGeometricObject(circle);
        displayGeometricObject(rectangle);

      
    }

    public static void displayGeometricObject(GeoMatryObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
        System.out.println("Color is "+object.getColor());
        System.out.println("Created Date is "+object.getDateCreated());
    }
    
}
