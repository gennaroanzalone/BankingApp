package bankaccountapp;

public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;


    // Constructor to set base properties and initialize the account
    public Account(String name, String sSn, double initDeposit) {
        this.name = name;
        this.sSN = sSn;
        this.balance = initDeposit;

        // set account number
        index++;
        this.accountNumber = setAccountNumber();

        // get base rate
//        getBaseRate();
//        System.out.println(getBaseRate());

        setRate();
    }

    public abstract void setRate();


    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // List common methods
    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance
        );
    }
}
