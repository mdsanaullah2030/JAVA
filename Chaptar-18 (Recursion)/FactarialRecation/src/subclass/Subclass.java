
package subclass;


public class Subclass {
    private int n;

    public Subclass() {
    }

    public Subclass(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Subclass{" + "n=" + n + '}';
    }
    public int factarial(int n){
    if(n==0 || n==1){
        return 1;
    }
    else{
    return n*factarial(n-1);
    }
    
    
    }
}
