
package test;


public class student {
    private String name;
    private int id;
    private boolean employees;

    public student() {
    }

    public student(String name, int id, boolean employees) {
        this.name = name;
        this.id = id;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmployees() {
        return employees;
    }

    public void setEmployees(boolean employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "ArrayList{" + "name=" + name + ", id=" + id + ", employees=" + employees + '}';
    }
     
    
    
}
