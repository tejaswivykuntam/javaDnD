import java.util.Scanner;

public class TwoLargest {
    public static void calculate() {
        Scanner in = new Scanner(System.in);
        int arr[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int counter = 10;
        for (int i = 0; i < counter; i++) {
            System.out.printf("Enter value at index %d:", i);
            int val = in.nextInt();
            arr[i] = val;
        }
        int largest = arr[0];
        int largest2 = arr[0];
        for (int i = 0; i < counter; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < counter; i++) {
            if (arr[i] > largest2 && arr[i] != largest) {
                largest2 = arr[i];
            }
        }
        System.out.printf("Largest number among the input is: %d\n", largest);
        System.out.printf("Second largest number among the input is: %d\n", largest2);

        in.close();
    }

    public static void main(String args[]) {
        calculate();
    }
}
