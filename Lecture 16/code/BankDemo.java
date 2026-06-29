
class BankAccount{
    private String accountNumber;
    private double balance;
    private String accountHolderName;


    public BankAccount(String accountNumber, String accountHolderName, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate){
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Applied interest: " + interest);
    }

    @Override
    public void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


public class BankDemo {
    public static void main(String[] args){
        SavingsAccount mySavings = new SavingsAccount("123456789", "John Doe", 1000.0, 5.0);
        mySavings.displayAccountInfo();
        mySavings.deposit(500.0);
        mySavings.withdraw(200.0);
        mySavings.applyInterest();
        mySavings.displayAccountInfo();

    }
}