package bankaccountapp;

import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        String file = "/Users/gnnro/Desktop/NewBankAccounts.csv";



//        Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
//        Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);
//
//        savacc1.compound();
//
//        savacc1.showInfo();
//        System.out.println("**********************");
//        chkacc1.showInfo();


        // Read a CSV file then create new account based on that data
        List<String[]> newAccountHolders = utilities.csv.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
//            System.out.println(name + " " + ssn + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Savings")) {
                System.out.println("OPEN A SAVINGS ACCOUNT");
            } else if (accountType.equals("Checking")) {
                System.out.println("OPEN A CHECKING ACCOUNT");
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
    }
}
