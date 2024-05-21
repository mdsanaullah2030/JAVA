
package times;


public class Times implements Runnable{
  private char charToPrint; 
    private int test; 

    public Times(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.test = times;
    }

  

 
    @Override
    public void run() {
        for (int i = 0; i < test; i++) {
            System.out.print(charToPrint);
        }
    }
}

class PrintNum implements Runnable {

    private final int lastNum;

    
    public PrintNum(int n) {
        lastNum = n;
    }

    @Override
 
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }
    }

}
