package Java_College_Programs.PracticalExamPrograms;
/*
Account Holder: John Doe
Account ID: A123456
Balance: 1000.0
Successfully deposited 500.0. New balance: 1500.0
Successfully withdrew 200.0. New balance: 1300.0
Account Holder: John Doe
Account ID: A123456
Balance: 1300.0
*/
class BankAccount {
    // Attributes of the BankAccount class
    private final String accountHolderName;
    private final String accountID;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolderName, String accountID, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountID = accountID;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display the account information
    public void display() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: " + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a new bank account
        BankAccount account = new BankAccount("John Doe", "A123456", 1000.0);

        // Displaying initial account information
        account.display();

        // Depositing money into the account
        account.deposit(500.0);

        // Withdrawing money from the account
        account.withdraw(200.0);

        // Displaying updated account information
        account.display();
    }
}
