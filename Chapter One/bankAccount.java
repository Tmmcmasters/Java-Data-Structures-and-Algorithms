// This is a runable object oriented program that creates an account with an opening blance, displays the blance, makes a deposit and a widthdrawal, and then displays the new balance. 

public class bankAccount {
    
    private double balance; // account balance
    //Public and private are access modifiers.
    //Private meens that balance is only accessible within the class bankAccount hence why you have the methods like deposit and widthdrawal in this class. ------- 

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
        bankAccount ba1 = new bankAccount(100.00); 
        //^^^This creates an object of the bankAccount class and assigns the opening balance to the balance variable


        System.out.print("Your current balance before transactions is, ");
        ba1.display(); //displays balance

        ba1.deposit(50.00); //makes deposit
        ba1.withdraw(75.20); //makes withdraw

        System.out.print("Your current balance after transactions is, ");
        ba1.display(); //displays balance after transactions
    }
}
