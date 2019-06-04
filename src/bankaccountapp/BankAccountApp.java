package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();


        // Read a CSV file then create new account based on that data
        String file = "/Users/gnnro/Desktop/NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.csv.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
//            System.out.println(name + " " + ssn + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, ssn, initDeposit));
            }
            else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, ssn, initDeposit));
            }
            else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n******************");
            acc.showInfo();
        }
    }
}
