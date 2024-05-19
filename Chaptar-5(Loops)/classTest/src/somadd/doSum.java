
package somadd;


public class doSum {
  public int number1;
  public int number2;
  public int number3;
  
  public doSum(){
  }
  public doSum(int number1,int number2,int number3){
      this.number1=number1;
      this.number2=number2;
      this.number3=number3;
  }
  public int sum(){
  return number1+number2+number3;
  
  }
  public int subtraction(){
  return number1-number2-number3;
  }
  public int multiplicatin(){
  return number1*number2*number3;
          
  }
}
