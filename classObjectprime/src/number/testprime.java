
package number;


public class testprime {
    int number=1;
    public testprime(){
    
    }
    public testprime( int number){
        this.number=number;
    }
    public String checkprime(){
    int count=0;
    for(int i=1;i<=number;i++){
    if(number%i==0){
        count++;
    }
    }
    if(count==2){
    return "It is prime number";
    }
    else{
    return "It is not prime number";
    }
    }
    
}
