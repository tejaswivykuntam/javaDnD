import java.util.Scanner;
/**
 *
 * @author Tejaswi
 */
class e214 {
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("1 2 3 4");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4");
        System.out.println();
        System.out.printf("%s%s%s%s", "1 ", "2 ", "3 ", "4");
    }
}

class e215 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer");
        int in1 = input.nextInt();
        System.out.println("Enter another integer");
        int in2 = input.nextInt();
        
        int sq_sum = in1 * in1 + in2 * in2;
        int sq_diff = in1 * in1 - in2 * in2;
        
        System.out.println("Sum of squares is: " + sq_sum);
        System.out.println("Difference of squares is: " + sq_diff);
    }
}

class e216 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer");
        int in1 = input.nextInt();
        int in1sq = in1 * in1;
        if (in1 == 100){
            System.out.println(in1 + " == " + 100);
        }
        if (in1 != 100){
            System.out.println(in1 + " != " + 100);
        }
        if (in1 < 100){
            System.out.println(in1 + " < " + 100);
        }
        if (in1 > 100){
            System.out.println(in1 + " > " + 100);
        }
        if (in1 <= 100){
            System.out.println(in1 + " <= " + 100);
        }
        if (in1 >= 100){
            System.out.println(in1 + " >= " + 100);
        }
        
        if (in1sq == 100){
            System.out.println(in1sq + " == " + 100);
        }
        if (in1sq != 100){
            System.out.println(in1sq + " != " + 100);
        }
        if (in1sq < 100){
            System.out.println(in1sq + " < " + 100);
        }
        if (in1sq > 100){
            System.out.println(in1sq + " > " + 100);
        }
        if (in1sq <= 100){
            System.out.println(in1sq + " <= " + 100);
        }
        if (in1sq >= 100){
            System.out.println(in1sq + " >= " + 100);
        }
    } 
}

