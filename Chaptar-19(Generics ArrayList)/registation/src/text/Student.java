
package text;

public class Student<T,K,N> {
   private T name;
   private K id;
   private N gmail;

    public Student() {
    }

    public Student(T name, K id, N gmail) {
        this.name = name;
        this.id = id;
        this.gmail = gmail;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

    public N getGmail() {
        return gmail;
    }

    public void setGmail(N gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", gmail=" + gmail + '}';
    }
   
   
}
