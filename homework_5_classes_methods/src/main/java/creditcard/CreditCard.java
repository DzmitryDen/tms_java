package creditcard;

public class CreditCard {

    private final String account;
    private double currentAmount;

    //    constructor
    public CreditCard(String account, double amount) {
        this.account = account;
        this.currentAmount = amount;
    }

    public void depositAmount(double amount) {
        this.currentAmount += amount;
    }

    public void withdrawAmount(double amount) {
        this.currentAmount -= amount;
    }

    public String getInformation() {
        return "Number account: " + this.account + "; Account balance: " + this.currentAmount;
    }
}
