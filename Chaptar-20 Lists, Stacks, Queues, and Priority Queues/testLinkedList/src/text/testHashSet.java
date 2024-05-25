
package text;

import java.util.HashSet;

public class testHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits=new HashSet<>();
        
        fruits.add("APPLE");
        fruits.add("ORENGE");
        fruits.add("MANGO");
        fruits.add("BANANA");
        
//        boolean value=fruits.isEmpty();
//        System.out.println(value);
//        
        
        
        System.out.println(fruits);
//        
        for(String x:fruits){
            System.out.println(x);
//        }
    }
}
}
