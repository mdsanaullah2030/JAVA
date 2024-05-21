
package triangle;


public  abstract class Geomaetries {
   private String name;

    public Geomaetries() {
    }

    public Geomaetries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Geomaetries{" + "name=" + name + '}';
    }

 public  abstract  void getAriya();
   
   
}
