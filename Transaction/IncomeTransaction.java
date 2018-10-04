package Transaction;

import java.util.UUID;

public class IncomeTransaction implements Transaction {

    private double amount = 0;
    private double date = 0;
    private UUID identification;

    User uuid = new User();

    @Override
    public double getAmount() {
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

    public IncomeTransaction (double amount, double date) {
        this.amount = amount;
        this.date = date;
        this.identification = uuid.getId();
        System.out.println("Outcoming transaction done");
    }
}
