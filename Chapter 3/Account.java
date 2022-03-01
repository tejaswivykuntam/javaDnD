/**
 *
 * @author Tejaswi
 */
public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    public void withdraw(double withdrawAmount) { // Exercise 3.11
        if (withdrawAmount > 0.0 && withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        }
        else {
            System.out.println("Withdrawal amount exceeded account balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
