public class Tax{
    public void calculate(int earning, String name){
        double tax = 0;
        if(earning > 30000){
            tax = 0.2 * earning;
            System.out.printf("Tax for id %s is %.2f\n", name, tax);
        }
        else if(earning >= 0 && earning <= 30000){
            tax = 0.15 * earning;
            System.out.printf("Tax for id %s is %.2f\n", name, tax);
        }
        else{
            System.out.printf("Invalid input. Enter a positive amount\n");
        }
    }
}
