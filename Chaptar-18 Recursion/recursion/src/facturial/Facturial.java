package facturial;

public class Facturial {
    
    public static void main(String[] args) {
        Facturial facturial = new Facturial();
        int result = facturial.fact(5);
        System.out.println("Factorial "+result);
    }
    
    int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}

//[//Factorial work Time;
//fact(5)
//fact(int 5)
//if(n==1)
//return 1;
//else n*fact(5-4)
//else n*fact(4-3)
//else n*fact(3-2)
//else n*fact(2-1)[n==1]
//4*fact(3)=24
//3*fact(2)=6
//2*fact(1)=2]