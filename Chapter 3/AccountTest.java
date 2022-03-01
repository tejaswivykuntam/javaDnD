/**
 *
 * @author Tejaswi
 */
import java.util.Scanner;

public class AccountTest {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Account myAccount1 = new Account("Jane Doe", 50.0);
        Account myAccount2 = new Account("John Doe", 100.0);

        System.out.println("Account1 details: " + myAccount1.getName() + " " + myAccount1.getBalance());
        System.out.println("Account2 details: " + myAccount2.getName() + " " + myAccount2.getBalance());
        
        System.out.println("Enter deposit amount for Account1: ");
        double depositAmount = input.nextDouble();
        myAccount1.deposit(depositAmount);

        System.out.println("Enter withdraw amount for Account2: ");
        double withdrawAmount = input.nextDouble();
        myAccount2.withdraw(withdrawAmount);

        System.out.println("Account1 details: " + myAccount1.getName() + " " + myAccount1.getBalance());
        System.out.println("Account2 details: " + myAccount2.getName() + " " + myAccount2.getBalance());
    }
}
