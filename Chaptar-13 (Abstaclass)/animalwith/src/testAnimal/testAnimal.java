
package testAnimal;


public abstract class testAnimal {
  private String df;

    public testAnimal() {
    }

    public testAnimal(String df) {
        this.df = df;
    }

    public String getDf() {
        return df;
    }

    public void setDf(String df) {
        this.df = df;
    }

    @Override
    public String toString() {
        return "testAnimal{" + "df=" + df + '}';
    }
  public abstract void sound();
}
