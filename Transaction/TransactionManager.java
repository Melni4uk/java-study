package Transaction;

public class TransactionManager {
    public void count(double[] transactions){
        double count = 0;
        for (int i = 0; i < transactions.length; i++) {
            count += transactions[i];
        }
        System.out.println(count);
    }
}
