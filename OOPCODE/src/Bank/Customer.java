package Bank;

public class Customer {
    private String customerName;
    private int customerAge;
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public void setCustomerAge(int customerAge){
        this.customerAge=customerAge;
    }
    
    public int getCustomerAge(){
        return customerAge;
    }
}
