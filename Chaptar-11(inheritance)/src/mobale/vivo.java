
package mobale;


public class vivo extends iohone{
    private  boolean GoodCemra;
    private boolean chargingBackup;
    private String color;

    public vivo() {
    }

    public vivo(boolean GoodCemra, boolean chargingBackup, String color) {
        this.GoodCemra = GoodCemra;
        this.chargingBackup = chargingBackup;
        this.color = color;
    }

    public vivo(boolean GoodCemra, boolean chargingBackup, String color, boolean makeclla, String makeText, String camera, String multimedia) {
        super(makeclla, makeText, camera, multimedia);
        this.GoodCemra = GoodCemra;
        this.chargingBackup = chargingBackup;
        this.color = color;
    }

    public boolean isGoodCemra() {
        return GoodCemra;
    }

    public void setGoodCemra(boolean GoodCemra) {
        this.GoodCemra = GoodCemra;
    }

    public boolean isChargingBackup() {
        return chargingBackup;
    }

    public void setChargingBackup(boolean chargingBackup) {
        this.chargingBackup = chargingBackup;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "vivo{" + "GoodCemra=" + GoodCemra + ", chargingBackup=" + chargingBackup + ", color=" + color + '}';
    }

    @Override
    public void printDetails() {
        
        super.printDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(" "+color+" "+ GoodCemra+" "+chargingBackup);
    }
    
    
}
