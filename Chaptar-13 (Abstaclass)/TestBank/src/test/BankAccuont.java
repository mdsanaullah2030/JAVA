
package test;


public abstract class BankAccuont {
  private String AccuontName;
    private double balance;

    public BankAccuont() {
    }

    public BankAccuont(String AccuontName, double balance) {
        this.AccuontName = AccuontName;
        this.balance = balance;
    }

    public String getAccuontName() {
        return AccuontName;
    }

    public void setAccuontName(String AccuontName) {
        this.AccuontName = AccuontName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccuont{" + "AccuontName=" + AccuontName + ", balance=" + balance + '}';
    }
    
    
     public  abstract void deposit(double amount);
    public  abstract void withdraw (double amount);
    
}
