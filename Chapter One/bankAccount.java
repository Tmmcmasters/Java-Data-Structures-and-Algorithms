// This is a runable object oriented program that creates an account with an opening blance, displays the blance, makes a deposit and a widthdrawal, and then displays the new balance. 

public class bankAccount {
    
    private double balance; // account balance

    public bankAccount (double openingBalance) {
        balance = openingBalance;
    }

    public void deposit (double amount) { //makes deposit
        balance += amount; 
    }

    public void withdraw(double amount) { //makes withdraw
        balance -= amount;
    }

    public void display() { //displays balance
        System.out.println("Your current balance is: " + balance);
    }

    
}

class BankApp {
    public static void main(String[] args) {
        bankAccount ba1 = new bankAccount(100.00); //creates account with opening balance of 100

        System.out.print("Your current balance before transactions is, ");
        ba1.display(); //displays balance

        ba1.deposit(50.00); //makes deposit
        ba1.withdraw(75.20); //makes withdraw

        System.out.print("Your current balance after transactions is, ");
        ba1.display(); //displays balance after transactions
    }
}
