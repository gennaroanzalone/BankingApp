package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;

    String accountNumber;
    double rate;


    // Constructor to set base properties and initialize the account
    public Account(String name, String sSn, double initDeposit) {
        this.name = name;
        this.sSN = sSn;
        this.balance = initDeposit;
        System.out.println("NAME: " + name + "\nSSN: " + sSn + "\nBALANCE: $" + balance);

        // set account number
        this.accountNumber = setAccountNumber();
        System.out.println("ACCOUNT NUMBER " + this.accountNumber);
    }

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2);
        return lastTwoOfSSN;
    }

    // List common methods
}
