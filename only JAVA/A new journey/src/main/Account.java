package main;
public class Account {
    static double bal = 0;
     String name;    
     int id;         


    public Account(String name, int id){
        this.name = name;
        this.id = id;
    }

    // Get balance
    public double balance(){
        return bal;
    }

    // Deposit amount
    public void deposit(double depositAmount){
        bal += depositAmount;
    }

    // Withdraw amount
    public void withdraw(double withdrawAmount){
        if(bal < withdrawAmount){
            System.out.println("Insufficient balance.");
        } else {
            bal -= withdrawAmount;
        }
    }
}
