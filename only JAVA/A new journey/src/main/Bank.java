package main;
import java.util.Scanner;
import main.Account;

public class Bank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and ID: ");
        String name = sc.nextLine();
        int id = sc.nextInt();    
        Account acc = new Account(name, id);
        System.out.println("Your account balance is: " + acc.balance());
        System.out.println("Enter the amount to deposit: ");
        double dtaka = sc.nextDouble();
        acc.deposit(dtaka);
        System.out.println("Your current balance is: " + acc.balance());
        System.out.println("Enter the amount to withdraw: ");
        double wtaka = sc.nextDouble();
        acc.withdraw(wtaka);
        System.out.println("Your current balance is: " + acc.balance());
        
        sc.close();
    }
}
