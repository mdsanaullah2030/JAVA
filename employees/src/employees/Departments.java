
package employees;


public class Departments {
   private String name;
   private int id;
 private int salary;
  private String jobid; 

    public Departments() {
    }

    public Departments(String name, int id, int salary, String jobid) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.jobid = jobid;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }
   void commpany(){
       System.out.println("Name"+name);
       System.out.println("ID"+id);
       System.out.println("Salary"+salary);
       System.out.println("jobid"+jobid);
   }
}
