
package singledimensionarray;
import java.util.Arrays;
import java.util.Random;


public class testDobuleArres {
    public static void main(String[] args) {
        int[] number=new int[5];
        for (int i=0;i<number.length;i++){  
            Random r=new Random();
            int num=r.nextInt(5)+1;
            number[i]=num;
            
            }
        int sum=0;
        for(int val:number){
            sum=val;
        
        }
        System.out.println(Arrays.toString(number));
        System.out.println(number);
        System.out.println("Sum "+ sum);
      
    }
  
}
//for (int i=0;i<myList.length;i++){
//    Random r=new Random();
//    int num=r.nextInt(5)+1;
//    myList[i]=num;
//}