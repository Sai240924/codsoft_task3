public class BankAccount {
    private float balance;
    public BankAccount(float initialBalance){
        this.balance=initialBalance;
    }
    public float getBalance(){
        return balance;
    }
    public void setBalance(float balance){
        this.balance=balance;
    }
}