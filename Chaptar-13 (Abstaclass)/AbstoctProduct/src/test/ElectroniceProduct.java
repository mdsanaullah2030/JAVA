
package test;


public abstract class ElectroniceProduct {
    private String name;
    private  double regularPrice;

    public ElectroniceProduct() {
    }

    public ElectroniceProduct(String name, double regularPrice) {
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

    @Override
    public String toString() {
        return "ElectroniceProduct{" + "name=" + name + ", regularPrice=" + regularPrice + '}';
    }
    public abstract void Prouduct(String name,double regularPrice);
    public abstract void getSalePrice();
}
