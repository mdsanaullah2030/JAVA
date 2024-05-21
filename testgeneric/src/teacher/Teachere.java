
package teacher;




public class Teachere {
    private String name;
    private String gamil;
    private int salary;
    private int id;

    public Teachere() {
    }

    public Teachere(String name, String gamil, int salary, int id) {
        this.name = name;
        this.gamil = gamil;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGamil() {
        return gamil;
    }

    public void setGamil(String gamil) {
        this.gamil = gamil;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teachere{" + "name=" + name + ", gamil=" + gamil + ", salary=" + salary + ", id=" + id + '}';
    }

   

    
  

   
    
    
    
    
}
