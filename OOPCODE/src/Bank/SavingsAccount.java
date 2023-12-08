package Bank;

public class SavingsAccount extends Account{
    private static final double minimumBalance=1000;
   
    public double getMinimumBalance(){
        return minimumBalance;
    }
    
    public boolean withdraw(double amount){
        if((balance-amount)>= minimumBalance){
            balance -=amount;
            return true;
        }
        else
            return false;
    }
}
