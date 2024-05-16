
package test;


public class Teacher extends Students{
    
    private String subject;

    public Teacher() {
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(String subject, String name, Integer agr, Integer Roll, Integer Reg) {
        super(name, agr, Roll, Reg);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" + "subject=" + subject + '}';
    }

 
    }

   

 

    

    

