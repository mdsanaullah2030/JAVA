
package testlists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;


public class TestLists {

  
    public static void main(String[] args) {
        ArrayList<String> county=new ArrayList<>();
        county.add("Bnagladesh");
        county.add("Pakistan");
        county.add("Silnka");
        county.add("Bhutan");
        county.add("Afganestan");
        county.add("Maldip");
        county.add("Nepal");
        county.add("Chaina");
        county.add("philypain");
        county.add("japan");
        county.add("Dubai");
        
//        ArrayList<String> n1=(ArrayList<String>)(county.clone());
//        System.out.println(n1);

        Iterator<String> it=county.iterator();
        
        while(it.hasNext()){
        System.out.println(it.next());
    }
        }
    
}
