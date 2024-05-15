
package test;

import java.util.ArrayList;
import java.util.Iterator;


public class testForArray {
    public static void main(String[] args) {
        ArrayList<String>number=new ArrayList<>();
        number.add("HAMIDULLAH");
        number.add("SANAULLAH");
        number.add("SIFAULLAH");
        number.add("SAMIULLAH");
        
//          for(String x:number){
//              System.out.println(x);

//          }   
Iterator itr=number.iterator();
    while(itr.hasNext()) {
            System.out.println(" "+itr.next());
    }
        System.out.println();
        System.out.println("size="+number.size());
    }
}
