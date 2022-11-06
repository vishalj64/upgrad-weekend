package Session4;

public class Account {
    private int accNo;
    private long mNumber;


    private boolean updateBalance() {
        System.out.println("Balance updated");
        return true;
    }

    private boolean verifyAtmPin() {

        System.out.println("Atm verified");
        return true;
    }

    public void cashwithdrawal(double amt, String cardDetails) {
        if(verifyAtmPin()) {
            updateBalance();
        }

    }

    public int getAccNo() {
        return accNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", mNumber=" + mNumber +
                ", balance=" + balance +
                '}';
    }

    public long getmNumber() {
        return mNumber;
    }

    public void setmNumber(long mNumber) {
        if(mNumber < 1111111111 || mNumber > 9999999999l) {
            System.out.println("Invalid number");
        } else {
            this.mNumber = mNumber;
        }

    }

    public double getBalance() {
        return balance;
    }


    private double balance;

    public double deposit(double amt) {
        if(amt <=0) {
            System.out.println("deposit not allowed");
        } else {
            balance += amt;
        }
        return balance;
    }
    public void withdraw(double amt) {
        if(amt <= balance) {
            balance -= amt;

        } else {
            System.out.println("insufficient funds");
        }
    }
    public Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}
