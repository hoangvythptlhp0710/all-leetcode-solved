package Tut6;

import javax.naming.ldap.BasicControl;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance: ");
        int a = sc.nextInt();
        BankAccount test = new BankAccount(a);
        test.deposit(230);
        test.withdraw(321);
        test.accName("Trst");
        test.annualInterest(6);
        test.tostring();
        test.transfer(test ,72000);
    }
    String name;
    double balance;
    int transactions;
    public BankAccount(double initial){
        this.balance = initial;
        this.transactions = 1;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("The amount of money after depositing: " + balance);
        transactions++;
    }

    public void withdraw(double amount){

        balance -= amount;
        System.out.println("The amount of money after withdrawing: " + balance);
        transactions++;

    }
    public void monthlyFee(){
        this.withdraw(10);
    }

    public void accName(String name){
        this.name = name;
    }
    public void annualInterest(double rate){
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("The amount of balance after interest: " + balance);
        transactions++;
    }

    public void tostring(){

        if (balance < 0){
            System.out.println("The balance of the account " + name + ": -$" + Math.abs(balance));
        }
        System.out.println("The balance of the account " + name + ": $" +balance);
    }

    public void transfer(BankAccount other, double amt){
        double fee = 0.5;
        System.out.println("Transactions: " + transactions);
        if (balance < (amt + fee)){
            System.out.println("Cannot transfer because not enough balance.");
        }
        else{
            balance -= (amt + fee);
            other.balance += amt;
            System.out.println("The balance after transfering: "  + balance);
        }
    }
}
