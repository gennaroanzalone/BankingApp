package bankaccountapp;

public class Checking extends Account {
    // List the properties specific to a checking account (debit card # and pin #)
    int debitCardNumber;
    int debitCardPin;


    // Constructor to initialize checking account properties
    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    // List any methods specific to the checking account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                " Your Checking Account Details: " +
                "\n Debit Card Number: " + debitCardNumber +
                " \n Debit Card Pin: " + debitCardPin
        );
    }
}
