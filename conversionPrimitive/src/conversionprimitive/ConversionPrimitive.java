
package conversionprimitive;


public class ConversionPrimitive {

  
    public static void main(String[] args) {
       Integer i=new Integer("23");
        System.out.println(i);
        Integer j=new Integer(25);
                System.out.println(j);
              Integer sumi=Integer.valueOf("23");
              System.out.println(sumi);
              Integer mahi=Integer.parseInt("23", 8);
              System.out.println(mahi);
              Double d=new Double(24);
              System.out.println(d);
              Double f=Double.valueOf(30);
              System.out.println(f);
              Double k=Double.valueOf("23.4");
              System.out.println(k);
//         Integer[] intArray={1,2,3};
//         System.out.println(intArray[0]+intArray[1]+intArray[3]);
 Integer w=3+ new Integer(5);
        System.out.println(w);
        int q=new Integer(8)+new Integer(9);
        System.out.println(q);
    
              
    }
    
}
