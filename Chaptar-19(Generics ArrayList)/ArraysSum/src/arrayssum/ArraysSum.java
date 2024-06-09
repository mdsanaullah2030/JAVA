
package arrayssum;

public class ArraysSum {

 
    public static void main(String[] args) {
        int []myArrays={10,15,20,25,74,50,14};
        int sum=0;
        for(int i:myArrays)
        sum+=i;
        System.out.println("Arrays Total="+sum);
        System.out.println("Arrays Avarege="+ sum/myArrays.length);
        System.out.println("Index="+myArrays.length);
        
    }
    
}
