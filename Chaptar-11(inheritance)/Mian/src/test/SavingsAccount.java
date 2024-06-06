
package test;


public class SavingsAccount extends BankAccount{

    public SavingsAccount(String bankaccount, double balance) {
        super(bankaccount, balance);
    }

    @Override
    public void withdraw(double amount) {
       
        
        
         if (getBalance() - amount < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount);
        }
    }
    
    
    
    
}
