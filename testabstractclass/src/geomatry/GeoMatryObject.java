
package geomatry;

import java.util.Date;


public abstract class GeoMatryObject {
    private String color="white";
    private boolean filled;
    private Date deteCreated;

    public GeoMatryObject() {
        this.deteCreated = new Date();
    }

    public GeoMatryObject(String color,boolean filled) {
        this.filled = filled;
        this.deteCreated = new Date();
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDeteCreated() {
        return deteCreated;
    }

    public void setDeteCreated(Date deteCreated) {
        this.deteCreated = deteCreated;
    }
    

    @Override
    public String toString() {
        return "GeoMatryObject{" + "color=" + color + ", filled=" + filled + ", deteCreated=" + deteCreated + '}';
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();

    public String getDateCreated() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
    
}
