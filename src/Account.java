import java.util.ArrayList;
import java.util.Scanner;




public class Account {
    private int accountNumber;
    private double balance;
    private String accountHolderName;


    //this is the contructor
    public Account(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.accountHolderName = accountHolderName;
    }

    //this should be the first method to deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " has been deposited");
    }

    public void withdraw(double amount) {
        if(balance >= amount){
            balance-=amount;
            System.out.println(amount + " has been withdrawn");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

}