import java.util.*;
public class Atm {
    static double balance = 10000; // Initial balance
   Scanner in = new Scanner(System.in);
    public void withdraw()
    {
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = in.nextDouble();
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public void deposit()
    {
        System.out.print("Enter amount to deposit: ");
                    double depositAmount = in.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  //had to use another scanner previous scanner not working here
       Atm a = new Atm();
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
           int choice = in.nextInt();
            switch (choice) {
                case 1:
                   a.withdraw();
                    break;
                case 2:
                    a.deposit();
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

