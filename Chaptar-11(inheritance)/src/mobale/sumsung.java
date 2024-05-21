
package mobale;


public class sumsung extends iohone{
  private String plyStore;
  private  boolean tucheAble;

    public sumsung() {
    }

    public sumsung(String plyStore, boolean tucheAble) {
        this.plyStore = plyStore;
        this.tucheAble = tucheAble;
    }

    public sumsung(String plyStore, boolean tucheAble, boolean makeclla, String makeText, String camera, String multimedia) {
        super(makeclla, makeText, camera, multimedia);
        this.plyStore = plyStore;
        this.tucheAble = tucheAble;
    }

 

    public String getPlyStore() {
        return plyStore;
    }

    public void setPlyStore(String plyStore) {
        this.plyStore = plyStore;
    }

    public boolean isTucheAble() {
        return tucheAble;
    }

    public void setTucheAble(boolean tucheAble) {
        this.tucheAble = tucheAble;
    }

    @Override
    public String toString() {
        return "sumsung{" + "plyStore=" + plyStore + ", tucheAble=" + tucheAble + '}';
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
  
  
}
