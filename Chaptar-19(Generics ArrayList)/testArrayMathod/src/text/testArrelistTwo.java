
package text;

import java.util.ArrayList;


public class testArrelistTwo {
    public static void main(String[] args) {
        ArrayList<Integer> number1=new ArrayList<>();
        ArrayList<Integer> number2=new ArrayList<>();
        ArrayList<Integer> number3=new ArrayList<>();
        ArrayList<Integer> number4=new ArrayList<>();
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        number1.add(50);
        number1.add(60);
        System.out.println("Number1 ArreList: "+number1);
        
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        number2.add(5);
        number2.add(6);
        System.out.println("Number2: "+number2);
        
             number2.add(1);
        number3.add(70);
        number3.add(80);
        number3.add(85);
        number3.add(90);
        number3.add(94);
        System.out.println("Number2: "+number2);
        
        
             number2.add(1);
        number4.add(35);
        number4.add(45);
        number4.add(47);
        number4.add(55);
        number4.add(64);
        System.out.println("Number2: "+number2);
        
//        addAll mathod use number1 value number3 printe 
        
        number3.addAll(number1);
        System.out.println("Number3"+number3);
        
        boolean Result=number3.equals(number4);
        System.out.println("number3==number4:"+Result);
    }
}
