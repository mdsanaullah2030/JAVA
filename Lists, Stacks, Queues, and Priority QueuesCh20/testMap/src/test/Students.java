
package test;


public class Students {
    private String name;
    private Integer agr;
    private Integer Roll;
    private Integer Reg;

    public Students() {
    }

    public Students(String name, Integer agr, Integer Roll, Integer Reg) {
        this.name = name;
        this.agr = agr;
        this.Roll = Roll;
        this.Reg = Reg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAgr() {
        return agr;
    }

    public void setAgr(Integer agr) {
        this.agr = agr;
    }

    public Integer getRoll() {
        return Roll;
    }

    public void setRoll(Integer Roll) {
        this.Roll = Roll;
    }

    public Integer getReg() {
        return Reg;
    }

    public void setReg(Integer Reg) {
        this.Reg = Reg;
    }

    @Override
    public String toString() {
        return "Students{" + "name=" + name + ", agr=" + agr + ", Roll=" + Roll + ", Reg=" + Reg + '}';
    }
    
    
}
