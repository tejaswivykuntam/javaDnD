import java.util.Scanner;

public class RAT {
    public static void construct(int base){
        for(int i = 1; i <= base; i++){
            System.out.println("*".repeat(i));
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter base length:");
        int base = in.nextInt();
        if(base >= 1 && base <= 10){
            construct(base);
        }
        in.close();
    }
}
