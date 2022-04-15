import java.util.Scanner;

public class TaxTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tax tax = new Tax();
        int register = 1;
        while(register == 1){
            System.out.printf("Enter name of person or type \"exit\" to exit:\n");
            String name = in.nextLine();
            if( name != "exit" && name != ""){
                System.out.printf("Enter %s's income:\n", name);
                int income = in.nextInt();
                tax.calculate(income, name);
            }
            else{
                register = 0;
            }
        }
        in.close();
    }
}
