package Session3;

public class Account {

    private String name;

    private String address;

    private int pincode;

    private long mNumber;

    private String panNo;

    private long aadharNo;

     private String emailId;

    private boolean isCCNeeded;

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", pincode=" + pincode +
                ", mNumber=" + mNumber +
                ", panNo='" + panNo + '\'' +
                ", aadharNo=" + aadharNo +
                ", emailId='" + emailId + '\'' +
                ", isCCNeeded=" + isCCNeeded +
                ", balance=" + balance +
                ", accountNo=" + accountNo +
                '}';
    }

//    Account(String name, String resAdd, String panNo) {
//        this.name  = name;
//        address = resAdd;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public long getmNumber() {
        return mNumber;
    }

    public void setmNumber(long mNumber) {
        this.mNumber = mNumber;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public long getAadharNo() {
        return aadharNo;
    }



    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public boolean isCCNeeded() {
        return isCCNeeded;
    }

    public void setCCNeeded(boolean CCNeeded) {
        isCCNeeded = CCNeeded;
    }

    public double getBalance() {
        return balance;
    }



    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public Account(String name, String address, int pincode, long mNumber,
                   String panNo, long aadharNo, String emailId, boolean isCCNeeded, double balance) {
        this.name = name;
        this.address = address;
        this.pincode = pincode;
        this.mNumber = mNumber;
        this.panNo = panNo;
        this.aadharNo = aadharNo;
        this.emailId = emailId;
        this.isCCNeeded = isCCNeeded;
        this.balance = balance;
        this.accountNo = (int) (Math.random() * 200);
    }

    private double balance;

    private long accountNo;

    double deposit(double amount){

        balance = balance + amount;
        return balance;
    }

    double withdrawal(double amount){

        balance = balance - amount;
        return balance;
    }


}


