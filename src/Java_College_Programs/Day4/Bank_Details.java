package Java_College_Programs.Day4;
class BankAccount {
  private String name;
  private String id;
  private double balance;

  // Constructor
  public BankAccount(String name, String id, double initialBalance) {
    this.name = name;
    this.id = id;
    this.balance = initialBalance;
  }

  // Method to deposit money
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit successful. New balance is: " + balance);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  // Method to withdraw money
  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawal successful. New balance is: " + balance);
    } else {
      System.out.println("Invalid withdrawal amount.");
    }
  }

  // Method to display the balance
  public void display() {
    System.out.println("Account Balance for " + name + " (" + id + ") is: " + balance);
  }
}

class Main2 {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("John Doe", "123456", 5000.0);
    account.display();
    account.deposit(2000.0);
    account.withdraw(1500.0);
    account.display();
  }
}
