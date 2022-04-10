public class Credit {
    public void calculate(int ib, int tv, int tc, int cl, int accNum){
        int initBal = ib;
        int totalVal = tv;
        int totalCred = tc;
        int credLimit = cl;
        int newBal = initBal + totalVal - totalCred;

        if(newBal > credLimit){
            System.out.printf("Credit limit exceeded for account %d.\n", accNum);
        }
    }
}
