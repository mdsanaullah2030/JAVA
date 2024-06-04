
package factarial;


public class Factarial {

   
    public static void main(String[] args) {
Factarial factarial=new Factarial();
int result=factarial.fact(5);
        System.out.println(result);
    }
int fact(int n){
if(n==1){
return 1;
}
else{
return n*fact(n-1);
}
}
 
    
}
