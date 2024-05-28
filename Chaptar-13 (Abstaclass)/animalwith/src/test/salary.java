
package test;

import manager.Employee;
import manager.Manager;
import manager.Programmer;

public class salary {
    public static void main(String[] args) {
        Employee s=new Programmer("sanaullah", 2, 300, 1500, 3000);
        s.calculateSalary();
        Employee t=new Programmer("MD:SANAULLAH", 0, 0, 0, 0);
        t.displayInfo();
        
        Employee y=new Manager("samiullah", 3, 250, 1500, 400);
        y.calculateSalary();
        Employee p=new Manager("MD:SAMIULLAH", 0, 0, 0, 0);
        p.displayInfo();
        
    }
}
