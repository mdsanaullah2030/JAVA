
public class testThorw {
    public static void main(String[] args) {
        try {
            int x=10;
            int y=0;
             int ruselt=x/y;
            System.out.println("Result: "+ruselt);
        } catch (ExceptionInInitializerError e) {
            System.out.println("Exception Erros "+e);
            
        }
        catch ( Exception e1) {
            System.out.println("Exception Erros"+e1);
            
        }
//        finally work erros next line see
        finally{
        System.out.println("Last line the program");
        } 
    }
}
