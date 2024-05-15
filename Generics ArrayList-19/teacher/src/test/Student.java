
package test;


public class Student <E,T,U>{
    private E name;
    private T id;
    private U gmail;

    public Student() {
    }

    public Student(E name, T id, U gmail) {
        this.name = name;
        this.id = id;
        this.gmail = gmail;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public U getGmail() {
        return gmail;
    }

    public void setGmail(U gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", gmail=" + gmail + '}';
    }
    
    
}
