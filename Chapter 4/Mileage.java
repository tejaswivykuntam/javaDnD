import java.util.Scanner;

public class Mileage{

    public void trip(){
        Scanner in = new Scanner(System.in);

        int miles = 0;
        int gallons = 0;
        double mpg = 0;
        int totalMiles = 0;
        int totalGallons = 0;
        double totalMpg = 0;
        int trips = 0;

        System.out.printf("Enter the number of miles for trip %d or -1 to quit: ", trips+1);
        miles = in.nextInt();
        
        if(miles != -1){
            System.out.printf("Enter the number of gallons for trip %d: ", trips+1);
            gallons = in.nextInt();
            trips++;
        }

        while(miles != -1){
            totalMiles += miles;
            totalGallons += gallons;
            totalMpg = (double)totalMiles / totalGallons;

            mpg = (double)miles / gallons;

            System.out.printf("Trip %d's mpg is %.1f\n", trips, mpg);
        

        if(trips>1){
            System.out.printf("Total miles is %d\n", totalMiles);
            System.out.printf("Total gallons is %d\n", totalGallons);
            System.out.printf("Total mpg is %.1f\n", totalMpg);
        }

        trips++; 
         System.out.printf( "\nEnter trip %d mileage (as integer) or -1 to quit: ", trips );
         miles = in.nextInt();
         if ( miles != -1 )
         {
            System.out.printf( "Enter trip %d gallons (as integer): ", trips );
            gallons = in.nextInt();
         }
      } 

      if ( totalMiles != 0 )
      {
         System.out.printf( "\nFinal total miles driven is: %d\n", totalMiles);
         System.out.printf( "Final total gallons used is: %d\n", totalGallons);
         System.out.printf( "Final combined mpg is: %.1f\n\n", totalMpg);
      }
      else
         System.out.printf( "No trip information was entered.\n\n" );

    in.close();
    }
    
}