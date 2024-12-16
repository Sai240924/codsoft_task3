import java.util.*;
public class ATMInterface {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter initial balance for the Bank Account : ");        
        float initialBalance=s.nextFloat();
        BankAccount userAccount=new BankAccount(initialBalance);
        ATM atm=new ATM(userAccount);
        while (true) {
            System.out.println("\n------ATM Interface------");
            System.out.println("1. Withdraw"); System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit\n*************************");
            System.out.print("Select an option : ");
            int c=s.nextInt();
            switch (c) {
                case 1:
                    System.out.print("\nEnter amount to withdraw : ");
                    float wamount=s.nextFloat();
                    atm.withdraw(wamount);
                    break;
                case 2:
                    System.out.print("\nEnter amount to deposit : ");
                    float damount=s.nextFloat();
                    atm.deposit(damount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("EXITING...");
                    System.exit(0);
                    s.close();
                    break;
                default: System.out.println("Enter a Valid option.");
                    break;
            }
        }
    }
}