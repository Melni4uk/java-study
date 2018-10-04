package Transaction;

import java.util.UUID;

public class OutcomeTransaction implements Transaction {

    private double amount = 0;
    private double date = 0;
    private UUID identification;

    User uuid = new User();

    @Override
    public double getAmount() {
        System.out.println(this.amount);
        return this.amount;
    }

    @Override
    public double getDate() {
        System.out.println(this.date);
        return this.date;
    }

    @Override
    public UUID getId() {
        System.out.println(this.identification);
        return this.identification;
    }

    public OutcomeTransaction (double amount, double date) {
        this.amount = amount;
        this.date = date;
        this.identification = uuid.getId();
        System.out.println("Outcoming transaction done");
    }
}
