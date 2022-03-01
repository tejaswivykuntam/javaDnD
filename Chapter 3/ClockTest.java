import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock(12, 30, 45);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the hour: ");
        int hour = input.nextInt();
        System.out.println("Enter the minute: ");
        int minute = input.nextInt();
        System.out.println("Enter the second: ");
        int second = input.nextInt();

        clock.setHour(hour);
        clock.setMinute(minute);
        clock.setSecond(second);

        clock.displayTime();
    
    }
        
}
