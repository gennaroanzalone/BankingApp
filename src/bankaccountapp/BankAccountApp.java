package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args) {

        Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);

        Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);

        savacc1.showInfo();

        System.out.println("**********************");

        chkacc1.showInfo();
//
//        savacc1.deposit(5000);
//        savacc1.withdraw(200);
//        savacc1.transfer("Brokerage", 3000);

        // Read a CSV file then create new account based on that data

    }
}
