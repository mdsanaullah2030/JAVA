
package manager;


public class Manager extends Employee{

    public Manager() {
    }

    public Manager(String name, int howrlyrate, int overtime, int basicsalary, int bonus) {
        super(name, howrlyrate, overtime, basicsalary, bonus);
    }
    
    

    @Override
    public void calculateSalary() {
        System.out.println("Manager Total salary "+((super.getOvertime()*super.getHowrlyrate())  +((super.getBasicsalary()) +(super.getBonus()))));
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Name "+super.getName());
    }
    
}
