
package MaxMin;


public class textMax {
      public int number1;
  public int number2;
  public int number3;
  
  public textMax(){
  
  }
  public textMax(int number1,int number2,int number3){
      this.number1=number1;
      this.number1=number2;
      this.number1=number3;
   }

  public int finemax(){
  if( number1>number2 && number1>number3){
  return number1;
  }
  else if(number2>number1 && number2>number3){
      return number2;
  }
  else{
  return number3;
  }
  }
  public int minNumber(){
  if( number1<number2 && number1<number3){
  return number1;
  }
  else if(number2<number1 && number2<number3){
      return number2;
  }
  else{
  return number3;
  }
  }
}
 
