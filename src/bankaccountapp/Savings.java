package bankaccountapp;

public class Savings extends Account {
    // List properties specific to savings account
    private int safetyDepositBoxID;
    private int SafetyDepositBoxKey;

    // Constructor to initialize setting for the savings properties
    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        SafetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }
    // list any methods specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                " Your Savings Account Features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box Key: " + SafetyDepositBoxKey
        );
    }
}
