
package test;

public class BankAccount {
    private String bankaccount;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String bankaccount, double balance) {
        this.bankaccount = bankaccount;
        this.balance = balance;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "bankaccount=" + bankaccount + ", balance=" + balance + '}';
    }

  
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

  
}
    
    
  
    

