package DefiningClassesT6.Lab.BankAccount02;

public class BankAccount {

    private static double rate = 0.02;
    private static int bankAccountCount = 1;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = bankAccountCount;
        bankAccountCount++;
    }

    public static void setInterestRate(double interest) {
        rate = interest;
    }

	public double getInterest(int years){
        return rate * years * balance;
    }

	public void deposit(double amount){
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
