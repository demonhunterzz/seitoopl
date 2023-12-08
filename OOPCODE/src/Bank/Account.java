
package Bank;

abstract public class Account {
    
    protected double balance;
    protected int accountId;
    protected String accountType;
    protected Customer custobj;
    
    public void setBalance(double balance){
        this.balance=balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setAccountId(int accountId){
        this.accountId=accountId;
    }
    
    public int getAccountId(){
        return accountId;
    }
    
    public void setAccountType(String accountType){
        this.accountType=accountType;
    //...
    }
    
    public String getAccountType(){
        return accountType;
    }
    
    public void setCustomerObject(Customer custobj){
        this.custobj=custobj;
    }
    
    public Customer getCustomerObject(){
        return custobj;
    }
    public abstract boolean withdraw(double amount);
}
