
package test;


public class SavingsAccoun extends BankAccuont{
    private double amount;

    public SavingsAccoun() {
    }

    public SavingsAccoun(double amount) {
        this.amount = amount;
    }

    public SavingsAccoun(double amount, String AccuontName, double balance) {
        super(AccuontName, balance);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "SavingsAccoun{" + "amount=" + amount + '}';
    }
    
    

    @Override
    public void deposit(double amount) {
        System.out.println("Total Blance"+(super.getBalance()+amount));
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Current Ammunt"+ (super.getBalance()-amount));
        
    }
    
}
