
package testarraymathod;

import java.util.ArrayList;


public class TestArrayMathod {

 
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
//   /*   Adding Element*/
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        number.add(70);
        number.add(80);
        number.add(90);
        number.add(100);
        System.out.println(number);
          System.out.println("size="+number.size());
          
//          [mathod use ArrayList]
//clear bolbe Element acche ki na yes hole isEmpty true/clear na add korle flose
//number.clear();
boolean check=number.isEmpty();
        System.out.println("ArrayList Empty: "+check);
        
        
      boolean position=number.contains(10);
        System.out.println("03 is the ArreListe: "+position);
        
        
      int pos=number.indexOf(40);
        System.out.println(pos);
        
        
//        /*set mathot work refles[3 index 50 add]*/
number.set(7, 78);
        System.out.println(number);
        
        int x=number.get(5);
        System.out.println(x);

    }
    
}
