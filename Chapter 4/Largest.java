import java.util.Scanner;

public class Largest {
    public static void calculate(){
        Scanner in = new Scanner(System.in);
        int arr[] = {0,0,0,0,0,0,0,0,0,0};
        int counter = 10;
        for(int i = 0; i < counter; i++){
            System.out.printf("Enter value at index %d:", i);
            int val = in.nextInt();
            arr[i] = val;
        }
        int largest = arr[0];
        int number = arr[9];
        for(int i = 0; i < counter; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.printf("Most recently input integer is: %d\n", number);
        System.out.printf("Largest number among the input is: %d\n", largest);

        in.close();
    }
    
    public static void main(String args[]){
        calculate();
    }
}
