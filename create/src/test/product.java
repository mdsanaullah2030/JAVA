
package test;


public class product {
    private String name;
    private double regularPrice;

    public product() {
    }

    public product(String name, double regularPrice) {
        this.name = name;
        this.regularPrice = regularPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    public double getSalePrice(){
    return regularPrice;
    
    }
}
