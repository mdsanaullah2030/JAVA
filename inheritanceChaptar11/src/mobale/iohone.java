
package mobale;


public class iohone {
   private boolean makeclla;
   private String makeText;
   private String camera;
   private String multimedia;

    public iohone() {
    }

    public iohone(boolean makeclla, String makeText, String camera, String multimedia) {
        this.makeclla = makeclla;
        this.makeText = makeText;
        this.camera = camera;
        this.multimedia = multimedia;
    }

    public boolean isMakeclla() {
        return makeclla;
    }

    public void setMakeclla(boolean makeclla) {
        this.makeclla = makeclla;
    }

    public String getMakeText() {
        return makeText;
    }

    public void setMakeText(String makeText) {
        this.makeText = makeText;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "iohone{" + "makeclla=" + makeclla + ", makeText=" + makeText + ", camera=" + camera + ", multimedia=" + multimedia + '}';
    }
public  void  printDetails(){
    System.out.println("Mobail Details is "+makeclla+" "+makeText+" "+camera+" "+multimedia);
}
   
}
