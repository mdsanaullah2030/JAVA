
package text;

public class SubClass {
    private int n;

    public SubClass(int n) {
        this.n = n;
    }

    public SubClass() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "SubClass{" + "n=" + n + '}';
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
