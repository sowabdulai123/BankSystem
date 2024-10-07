import java.sql.SQLOutput;
import java.util.Scanner;

public class BankManagementSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to Abc Bank. What would you like to do?");
            System.out.println("1. Open an account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check balance");
            System.out.println("5. Display accounts");
            System.out.println("6. Exit");
            System.out.println("Enter your option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter account holder name: ");
                    String accountHolderName = scanner.nextLine();
                    bank.createAccount(accountHolderName);
                    break;

                case 2:
                    System.out.println("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    Account account = bank.getAccount(accountNumber);
                    if (account != null) {
                        account.deposit(amount);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextInt();
                    account = bank.getAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Balance: $" + account.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    bank.displayAccounts();



            }

        }




    }



    }
