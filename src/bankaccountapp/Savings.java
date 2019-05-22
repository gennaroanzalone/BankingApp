package bankaccountapp;

public class Savings extends Account {
    // List properties specific to savings account
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

    // Constructor to initialize setting for the savings properties
    public Savings(String name) {
        super(name);
        System.out.println("SAVINGS ACCOUNT");
    }
    // list any methods specific to savings account
}
