
package currenttime;


public class CurrentTime {

  
    public static void main(String[] args) {
      long CurrentTime=System.currentTimeMillis();
        System.out.println();
        
        long totalsecond=CurrentTime/1000;
         System.out.println(totalsecond);
          long currentSecond=totalsecond %60;
          
          long totalMinutes=totalsecond/60;
          System.out.println(totalMinutes);
          
          long currenMinutes=totalMinutes %60;
          System.out.println(currenMinutes);
          
          long totalHours=totalMinutes /60;
          System.out.println(totalHours);
          
          long currenHours=totalHours %24;
          long gmt=+6;
          System.out.println("current time" +currenHours+":"+ currenMinutes+":"+currentSecond+gmt);
    }
    
}
