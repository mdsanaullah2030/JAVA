
package premnumber;


public class Test {
int number=0;

    public Test() {
    }
    
    
    public String checkprimeNumber(){
        
        int count=0;
                  for (int j =1; j <= number; j++) {
           

                if (j % j == 0) {
                    count++;// count=1 count=2
                }
            }

            if (count == 2) {
               return "it is prime number";
            }
            else{
            return "it is not prime number";
            }
                
          
    }
    
}
    
    

