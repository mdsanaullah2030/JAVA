
package employees;


public class Jobs extends Departments{
  private String age;

    public Jobs() {
    }

    public Jobs(String age) {
        this.age = age;
    }

    public Jobs(String age, String name, int id, int salary, String jobid) {
        super(name, id, salary, jobid);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    void commpany() {
        super.commpany(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(age);
    }




    
    
}
