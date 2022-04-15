import java.util.Scanner;

public class Palindrome {
    public static void verify(int number){
    
        String temp = Integer.toString(number);
        int[] arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i) - '0';
        }
        if(arr[0] == arr[4] && arr[1] == arr[3]){
            System.out.printf("Input is a palindrome!\n");
        }
        else{
            System.out.printf("Input is not a palindrome.\n");
        }
    }

    public static void checkLength(int input){
        Scanner test = new Scanner(System.in);
        String len = Integer.toString(input);
        if (len.length() != 5) {
            System.out.printf("Wrong input format. Enter a number that is 5 digits long:");
            int testint = test.nextInt();
            checkLength(testint);
        }
        else{
            verify(input);
        }
        test.close();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a number to check if it's a palindrome:");
        int input = in.nextInt();
        checkLength(input);
        
        in.close();
    }
}
