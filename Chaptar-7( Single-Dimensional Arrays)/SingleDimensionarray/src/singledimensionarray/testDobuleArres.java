
package singledimensionarray;
import java.util.Arrays;
import java.util.Random;


public class testDobuleArres {
    public static void main(String[] args) {
        int[] number=new int[20];
        for (int i=0;i<number.length;i++){  
            Random r=new Random();
            int num=r.nextInt(20)+1;
            number[i]=num;
            
            }
        int sum=0;
        int avg=0;
       int count=0;
       int max=0;
        for(int val:number){
            sum+=val;
        
        }
        avg=sum/number.length;
        for(int var:number){
        if(avg<var){
            count++;
        }
        }
        for(int val:number){
            if(max<val){
                max=val;
            }
        }
        avg=sum/number.length;
        System.out.println(Arrays.toString(number));
        System.out.println(number);
        System.out.println("Sum "+ sum);
        System.out.println("Avg "+ avg);
        System.out.println("Count "+ count);
        System.out.println("Max "+max);
      
    }
  
}
//for (int i=0;i<myList.length;i++){
//    Random r=new Random();
//    int num=r.nextInt(5)+1;
//    myList[i]=num;
//}