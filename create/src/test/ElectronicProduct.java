
package test;


public class ElectronicProduct extends product{
    
    private int werrantyPerio;

    public ElectronicProduct() {
    }

    public ElectronicProduct(int werrantyPerio) {
        this.werrantyPerio = werrantyPerio;
    }

    public ElectronicProduct(int werrantyPerio, String name, double regularPrice) {
        super(name, regularPrice);
        this.werrantyPerio = werrantyPerio;
    }

    public int getWerrantyPerio() {
        return werrantyPerio;
    }

    public void setWerrantyPerio(int werrantyPerio) {
        this.werrantyPerio = werrantyPerio;
    }

    @Override
    public double getSalePrice() {
        if(this.werrantyPerio>1){
            return super.getRegularPrice()-super.getRegularPrice()*.15;
        
        }
        return super.getSalePrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
    }

 
    
    
}
