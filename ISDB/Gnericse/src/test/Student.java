
package test;

public class Student <T,N,E>{
   private T name;
   private N gmail;
   private E age;

    public Student() {
    }

    public Student(T name, N gmail, E age) {
        this.name = name;
        this.gmail = gmail;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public N getGmail() {
        return gmail;
    }

    public void setGmail(N gmail) {
        this.gmail = gmail;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gmail=" + gmail + ", age=" + age + '}';
    }
   
   
}
