
package test;


public class Factarial {
    private int n;

    public Factarial() {
    }

    public Factarial(int n) {
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
        return "Factarial{" + "n=" + n + '}';
    }
    public  int fac(int  n){
    if(n==0 || n==1){
     return 1;
    }
    else{
    return n*fac(n-1);
    } 
    }
    
}
