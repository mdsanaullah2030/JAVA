
package manager;


public class Programmer extends Employee{

    public Programmer() {
    }

    public Programmer(String name, int howrlyrate, int overtime, int basicsalary, int bonus) {
        super(name, howrlyrate, overtime, basicsalary, bonus);
    }
    
    

    @Override
    public void calculateSalary() {
        System.out.println("Total Salary "+((super.getOvertime()*super.getHowrlyrate())  +((super.getBasicsalary()) +(super.getBonus()))));
    }

    @Override
    public void displayInfo() {
        System.out.println("Name "+super.getName()); 
    }
    
}
