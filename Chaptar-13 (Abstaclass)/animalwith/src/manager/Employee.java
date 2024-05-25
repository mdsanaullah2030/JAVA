
package manager;


public abstract class Employee {
    private String name;
   private int howrlyrate;
   private int overtime;
   private int basicsalary;
   private int bonus;

    public Employee() {
    }

    public Employee(String name, int howrlyrate, int overtime, int basicsalary, int bonus) {
        this.name = name;
        this.howrlyrate = howrlyrate;
        this.overtime = overtime;
        this.basicsalary = basicsalary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowrlyrate() {
        return howrlyrate;
    }

    public void setHowrlyrate(int howrlyrate) {
        this.howrlyrate = howrlyrate;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public int getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(int basicsalary) {
        this.basicsalary = basicsalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", howrlyrate=" + howrlyrate + ", overtime=" + overtime + ", basicsalary=" + basicsalary + ", bonus=" + bonus + '}';
    }
   public abstract void calculateSalary();
   public abstract void displayInfo();
   
   
    
}
