
package registation;


public class StudentAddres {
    private String name;
    private String id;
    private String email;
    private boolean regular;

    public StudentAddres() {
    }

    public StudentAddres(String name, String id, String email, boolean regular) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.regular = regular;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    @Override
    public String toString() {
        return "StudentAddres{" + "name=" + name + ", id=" + id + ", email=" + email + ", regular=" + regular + '}';
    }
    
    
}
