public class TestBankAccount{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        
        // account1.deposit("checking", 500);
        // account1.deposit("savings", 300);

        // System.out.println("account 1 checking: $" + account1.getCheckingBalance());
        // System.out.println("account 1 savings: $" + account1.getSavingsBalance());
        
        account2.deposit("checking", 600);
        account2.deposit("savings", 400);

        // account1.withdraw("savings", 150);
        // System.out.println("account 1 savings: $" + account1.getSavingsBalance());

        // System.out.println("account 1 checking: $" + account1.getCheckingBalance());
        // System.out.println("account 1 savings: $" + account1.getSavingsBalance());

        account2.withdraw("savings", 250);
        System.out.println("account 2 savings: $" + account2.getSavingsBalance());

        System.out.println("account 2 checking: $" + account2.getCheckingBalance());
        System.out.println("account 2 savings: $" + account2.getSavingsBalance());
        
    }
}