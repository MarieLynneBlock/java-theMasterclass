package Section05A_Classes.Codelab026_CodeChallenge_Classes;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String phoneNumber;
    private String emailAddress;

    // Constructor --- refactoring with new information
    public BankAccount() {
        System.out.println("Empty constructor");
    }

    public BankAccount(long accountNumber,
                       double balance,
                       String customerName,
                       String phoneNumber,
                       String emailAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Methods
    public void doDeposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("You did deposit " + depositAmount + ". Brings total amount to: " + balance);
    }

    public void doWithdrawal(double withdrawalAmount) {
        if (this.balance > withdrawalAmount) {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal successful, you have now: " + balance);
        } else {
            System.out.println("Insufficient funds. You have only " + balance + " available.");
        }
    }

    // Getters & Setters
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}

