
package chaptar5loop;


public class breakContinue {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i==10){
                break;
            }
            if(i>13){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
