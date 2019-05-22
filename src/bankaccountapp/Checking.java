package bankaccountapp;

public class Checking extends Account {
    // List the properties specific to a checking account (debit card # and pin #)
    int debitCardNumber;
    int debitCardPin;


    // Constructor to initialize checking account properties
    public Checking(String name) {
        super(name);
        System.out.println("CHECKING ACCOUNT");
    }

    // List any methods specific to the checking account
}
