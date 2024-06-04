
package test;


public class Registation <T,E,K>{
    private T name;
    private E id;
    private K gmail;

    public Registation() {
    }

    public Registation(T name, E id, K gmail) {
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

    public E getId() {
        return id;
    }

    public void setId(E id) {
        this.id = id;
    }

    public K getGmail() {
        return gmail;
    }

    public void setGmail(K gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Registation{" + "name=" + name + ", id=" + id + ", gmail=" + gmail + '}';
    }
    
    
}
