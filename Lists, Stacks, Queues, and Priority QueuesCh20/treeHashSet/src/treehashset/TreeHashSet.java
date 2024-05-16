
package treehashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;




public class TreeHashSet {

  
    public static void main(String[] args) {
        Set<String> county=new HashSet<>();
        county.add("Bangladesh");
        county.add("Japan");
        county.add("canada");
        county.add("Pakistan");
        county.add("Afganithan");
        
        
        TreeSet<String> x=new TreeSet<>(county);
        System.out.println(x.first());
        System.out.println(x.floor("Pakistan"));
        System.out.println(x.last());
        System.out.println(x.ceiling("Japan"));
        System.out.println(x);
        
    }
    
}
