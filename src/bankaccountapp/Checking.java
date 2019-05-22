package bankaccountapp;

public class Checking extends Account {
    // List the properties specific to a checking account (debit card # and pin #)
    int debitCardNumber;
    int debitCardPin;


    // Constructor to initialize checking account properties
    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        System.out.println("ACCOUNT TYPE: CHECKING");
    }

    // List any methods specific to the checking account
}
