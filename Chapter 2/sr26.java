import java.util.Scanner;
/**
 *
 * @author Tejaswi
 */
public class sr26 {

    public static void main(String args[]) {
        int t1, t2, t3;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter marks in the 1st test");
        t1 = input.nextInt();
        System.out.println("Enter marks in the 2nd test");
        t2 = input.nextInt();
        System.out.println("Enter marks in the 3rd test");
        t3 = input.nextInt();
        
        int total = t1 + t2 + t3;
        System.out.printf("%s%d", "Total marks: ", total);
    }
}
