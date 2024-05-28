
package text;


public class Subfebonaccio {
    private long indext;

    public Subfebonaccio() {
    }

    public Subfebonaccio(long indext) {
        this.indext = indext;
    }

    public long getIndext() {
        return indext;
    }

    public void setIndext(long indext) {
        this.indext = indext;
    }
    public long febonacci(long  indext){
    if(indext==0){
    return 0;
    } 
    else if(indext==1){
    return 1;
    }
    else{
    return febonacci(indext-1)+febonacci(indext-2);
    }
  
    }
    
}
