public class Outcome {
    public double amount;
    public String comment;

    public void giveMoney(double amount, String comment) {
        this.amount = amount;
        this.comment = comment;
    }
}
