
package vowelconsonant;

import java.util.Scanner;


public class VowelConsonant {

  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String lettar=s.next();
        if(lettar.equalsIgnoreCase("a")){
            System.out.println("Vowel"); 
        }
        else if(lettar.equalsIgnoreCase("e")){
            System.out.println("Vowel"); 
        }
        else if(lettar.equalsIgnoreCase("i")){
           System.out.println("Vowel");  
        }
        else if(lettar.equalsIgnoreCase("o")){
            System.out.println("Vowel"); 
        }
        else if(lettar.equalsIgnoreCase("u")){
            System.out.println("Vowel"); 
        }
             else {
            System.out.println("consonant"); 
        }
        
        }        
                
    }
   
