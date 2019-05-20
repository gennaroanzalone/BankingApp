package bankaccountapp;

public class Checking extends Account {
    // List the properties specific to a checking account (debit card # and pin #)

    // Constructor to initialize checking account properties
    public Checking(String name) {
        super(name);
        System.out.println("NEW CHECKING ACCOUNT");
        System.out.println("NAME: " + name);
    }

    // List any methods specific to the checking account
}
