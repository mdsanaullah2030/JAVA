
package test;

import tdtf.Icurd;


public class Registation implements Icurd<Student>{
    private Student reging;

    public Registation() {
    }

    @Override
    public void save(Student t) {
        
        System.out.println("Bngladesh");
    }

    @Override
    public void delete(Student t) {
        
        System.out.println("Sanaullah");
    }
    
    
}
