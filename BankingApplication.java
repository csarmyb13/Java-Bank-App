import java.util.Scanner;

public class BankingApplication {
     public static void main(String[] args) {

        BankAccount obj1 = new BankAccount("Christopher" ,"103329");
        obj1.showMenu();
    }
}

class BankAccount
{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

BankAccount(String custname,String custid)
{
    customerName = custname;
    customerId = custid;
}

    void deposit(int amount)
    {
        if(amount > 0)
        {
        balance = balance + amount;
        previousTransaction = amount;
        }
    }

    void withdraw(int amount)
    {
        if(amount != 0)
        {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction()
     {
        if(previousTransaction > 0)
        {
            System.out.println("Deposit: " + previousTransaction);
        }
        else if(previousTransaction < 0)
        {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("No transaction occured");
        } 
     }

     
    void showMenu()
     {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome, " + customerName);
        System.out.println("your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Make Deposit");
        System.out.println("C. Make Withdraw");
        System.out.println("D. View Previous Transaction");
        System.out.println("E. Exit");

        while (true) 
        {
            System.out.println("--------------------------------");
            System.out.println("Enter an option");
            System.out.println("--------------------------------");
            char option =scnr.next().charAt(0);
            System.out.println("\n");


        switch(option)
        {
            case 'A':
            System.out.println("-----------------------------");
            System.out.println("Balance = " + balance);
            System.out.println("-----------------------------");
            System.out.println("\n");
            break;

            case 'B':
            System.out.println("-----------------------------");
            System.out.println("Enter Amount to Deposit:");
            System.out.println("-----------------------------");
            int amount = scnr.nextInt();
            deposit(amount);
            System.out.println("\n");
            break;

            case 'C':
            System.out.println("-----------------------------");
            System.out.println("Enter Amount to Withdraw:");
            System.out.println("-----------------------------");
            int amount2 = scnr.nextInt();
            withdraw(amount2);
            System.out.println("\n");
            break;

            case 'D':
            System.out.println("-----------------------------");
            getPreviousTransaction();
            System.out.println("-----------------------------");
            System.out.println("\n");
            break;

            case 'E':
            System.out.println("*!*!*!*!*!*!*!*!*!*!*!*!!*!*!*");
            break;


            default:
            System.out.println("Invalid Option! Please Enter and Try Again");
            break;
        }
    
    
    System.out.println("Thank You! See You Next Time!");
    
        }
}
}