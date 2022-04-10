public class Sales {
    public void commission(int s, int g, int id){
        double gross = g;
        double commission = 0.09 * gross;

        System.out.printf("Total earnings for salesperson %d is $%.2f\n", id, commission+200);

    }
}
