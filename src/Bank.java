import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private int accountCounter = 1;

    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void createAccount(String accountHolderName) {
        Account account = new Account(accountCounter++, accountHolderName);
        accounts.add(account);
        System.out.println("Account created for " + account.getAccountNumber());

    }

    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Number:" + account.getAccountNumber() +
                    "Balance" + account.getBalance() +
                    "Name" + account.getAccountHolderName());
        }
    }
}


