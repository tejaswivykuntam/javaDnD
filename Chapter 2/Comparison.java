/**
 *
 * @author Tejaswi
 */
import java.util.Scanner;

public class Comparison {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();
        
        if (num1 == num2){
            System.out.println(num1 + " == " + num2);
        }
        if (num1 != num2){
            System.out.println(num1 + " != " + num2);
        }
        if (num1 < num2){
            System.out.println(num1 + " < " + num2);
        }
        if (num1 > num2){
            System.out.println(num1 + " > " + num2);
        }
        if (num1 <= num2){
            System.out.println(num1 + " <= " + num2);
        }
        if (num1 >= num2){
            System.out.println(num1 + " >= " + num2);
        }
    }
}
