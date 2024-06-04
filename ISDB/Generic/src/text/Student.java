
package text;

public class Student<T,E,K> {
   private T name;
   private E gmail;
   private K id;

    public Student() {
    }

    public Student(T name, E gmail, K id) {
        this.name = name;
        this.gmail = gmail;
        this.id = id;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getGmail() {
        return gmail;
    }

    public void setGmail(E gmail) {
        this.gmail = gmail;
    }

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gmail=" + gmail + ", id=" + id + '}';
    }
   
   
}
