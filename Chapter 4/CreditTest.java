import java.util.Scanner;

public class CreditTest {
    public static void main(String[] args){
        Credit calc = new Credit();
        Scanner in = new Scanner(System.in);
        int run = 1;

        while(run!=0){
            System.out.printf("Enter account number or -1 to exit: ");
            int accNum = in.nextInt();
            if(accNum == -1){
                break;
            }
            System.out.printf("Enter initial balance: ");
            int initBal = in.nextInt();
            System.out.printf("Enter total value of account: ");
            int totalVal = in.nextInt();
            System.out.printf("Enter total credit: ");
            int totalCred = in.nextInt();
            System.out.printf("Enter credit limit: ");
            int credLimit = in.nextInt();
            

            calc.calculate(initBal, totalVal, totalCred, credLimit, accNum);
        }
        in.close();

    }   
}
