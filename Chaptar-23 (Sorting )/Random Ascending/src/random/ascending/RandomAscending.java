
package random.ascending;

import java.util.Arrays;
import java.util.Scanner;

public class RandomAscending {

  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        Integer[]number=new Integer[10];
        System.out.println("Please Inter 10 number");
        for(int i=0;i<number.length;i++){
            number[i]=scanner.nextInt();
            
        
        }
        Arrays.sort(number);
        for(int num:number){
            System.out.println(num);
        }
        
    }
    
}
