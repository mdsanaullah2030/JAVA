
package arraye;

import java.util.Arrays;


public class Arraye {

 
    public static void main(String[] args) {
        int[] myArraye1={10,23,24,26,15,17,19};
        String[]myArraye2={"java","C+","pathan","C#","oracal"};
        
        
        System.out.println("old "+Arrays.toString(myArraye1));
        Arrays.sort(myArraye1);
        System.out.println("new "+Arrays.toString(myArraye1));
        
        
        System.out.println("old "+Arrays.toString(myArraye2));
        Arrays.sort(myArraye2);
        System.out.println("new "+Arrays.toString(myArraye2));
    }
    
}
