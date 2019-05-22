package bankaccountapp;

public class Savings extends Account {
    // List properties specific to savings account
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

    // Constructor to initialize setting for the savings properties
    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        System.out.println("ACCOUNT TYPE: SAVINGS");
    }
    // list any methods specific to savings account
}
