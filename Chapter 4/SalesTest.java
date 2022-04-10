import java.util.Scanner;

public class SalesTest {
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sales salesperson = new Sales();
        System.out.print("Enter salesperson's ID: ");
        int id = in.nextInt();
        System.out.print("Enter salesperson's sales: ");
        int sales = in.nextInt();
        int register = 1;
        int res=0;

        while(register ==1){
            System.out.print("Enter salesperson's sale value or -1 to exit: ");
            int sale = in.nextInt();
            if(sale != -1){
                res += sale;
            }
            else{
                register = 0;
            }
            
        }
        
        salesperson.commission(sales, res, id);
    }
}
