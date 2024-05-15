
package testlinkedlist;

import java.util.LinkedList;


public class TestLinkedList {


    public static void main(String[] args) {
        LinkedList<String> member=new LinkedList<String>();
        
        member.add("MD:SANAULLAH");
        member.add("MD:SAMIULLAH");
        member.add("MD:HAMIDULLAH");
        member.add("MD:OBAIDULLAH");
        member.add("MD:ABDULLAH");
        member.addFirst("MD:MOSTAFIZUR");
        member.add(6, "MD:AHMADULLAH");
        member.addLast("MD:MAHAFUZUR");
        
//        --Remove--
//        member.remove("MD:OBAIDULLAH");

//        member.remove(5);

//        member.removeFirst();


//        member.removeLast();
        
       
//        System.out.println(member);
for(String famly:member){
    System.out.println(famly);
}
                
    }
    
}
