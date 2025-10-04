package Bank_Account_Package;

class BankAccount {
    private double balance = 0.0;

    BankAccount() {
        System.out.println("New BankAccount created with initial balance $0.0");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("✅ Deposit successful. Amount: $%.2f. New Balance: $%.2f\n", amount, balance);
        } else {
            System.out.println("❌ Deposit failed. Amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            double prsamount = balance - amount;
            if (prsamount >= 0) {
                balance = prsamount;
                System.out.printf("✅ Withdrawal successful. Amount: $%.2f. New Balance: $%.2f\n", amount, balance);
            } else {
                System.out.println("❌ Withdrawal failed. Insufficient funds. Current Balance: $%.2f\\n\", balance");
            }
        }


    }

    public double getBalance(){
        return balance;
    }

}

public class BankingSys {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.deposit(500.75);
        myAccount.withdraw(200.00);
        myAccount.withdraw(400.00); // Should fail

        System.out.printf("Final Balance: $%.2f\n", myAccount.getBalance());
        // Output: Final Balance: $300.75
    }
}
