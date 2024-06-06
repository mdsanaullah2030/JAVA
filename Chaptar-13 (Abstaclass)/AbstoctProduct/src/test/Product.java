
package test;




public class Product extends ElectroniceProduct{
private int warrantyPriod;

    public Product() {
    }

    public Product(int warrantyPriod) {
        this.warrantyPriod = warrantyPriod;
    }

    public Product(int warrantyPriod, String name, double regularPrice) {
        super(name, regularPrice);
        this.warrantyPriod = warrantyPriod;
    }

    public int getWarrantyPriod() {
        return warrantyPriod;
    }

    public void setWarrantyPriod(int warrantyPriod) {
        this.warrantyPriod = warrantyPriod;
    }

    @Override
    public String toString() {
        return "Product{" + "warrantyPriod=" + warrantyPriod + '}';
    }


    @Override
    public void Prouduct(String name, double regularPrice) {
        System.out.println(warrantyPriod=1);
    }

    @Override
    public void getSalePrice() {
       if(warrantyPriod >.15){
       
           System.out.println();
       } 
        
    }

  
}
