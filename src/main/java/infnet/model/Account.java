package infnet.model;

public class Account {

    private String number;
    private int pin;
    private double balance;

    public Account(String number, int pin) {
        this.number = number;
        this.pin = pin;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
