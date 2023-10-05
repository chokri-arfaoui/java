public class BankAccount {
    
    public static int  numberOfAccounts=0; 
    public static double totalAmount = 0.0;
    
    private double checkingBalance;
    private double savingsBalance; 
    private double totalMoney;

//    constructor
    public BankAccount(){
    BankAccount.numberOfAccounts=0;
    BankAccount.totalAmount = 0.0;
    
    
    numberOfAccounts++;
    }

    // geters and seters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance=checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance=savingsBalance;
        
    }
    public static double getTotalAccountAmount(){
        return BankAccount.totalAmount;
    }
    public void deposit(String account, double amount) {
        if (account.equals("checking")) {
            this.checkingBalance += amount;
            totalAmount += amount;
        } else if (account.equals("savings")) {
            this.savingsBalance += amount;
            totalAmount += amount;
        }
    }
    public void withdraw(String account, double amount){
        if (account.equals("checking") && checkingBalance<amount ){
            System.out.println("insufficient founds in the checking account");
        } else if (account.equals("checking") && checkingBalance>=amount ){
            this.checkingBalance-=amount;
            totalAmount -= amount;
        }

        if (account.equals("savings") && savingsBalance<amount ){
            System.out.println("insufficient founds in the  saving account ");
        }else if (account.equals("savings") && savingsBalance>=amount ){
            this.savingsBalance -= amount;
            totalAmount -= amount;
        
        }
        
    }
        public double getTotalMoney() {
            return this.checkingBalance + this.savingsBalance;
        }
        

}