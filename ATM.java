public class ATM {
    private BankAccount account;
    public ATM(BankAccount account){
        this.account=account;
    }
    public void withdraw(float wamount){
        try {
            if (wamount>account.getBalance()) {
                Thread.sleep(1000);
                System.out.println("Insufficient Balance.");
                Thread.sleep(1000);
            }else{
                account.setBalance(account.getBalance()-wamount);
                Thread.sleep(1000);
                System.out.println("Withrew amount : "+wamount+"\tCurrent Balance : "+account.getBalance());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
    public void deposit(float damount){
        try {
            account.setBalance(account.getBalance()+damount);
            Thread.sleep(1000);
            System.out.println("Deposited amount : "+damount+"\tCurrent Balance : "+account.getBalance()); 
            Thread.sleep(1000);  
        } catch (InterruptedException e) {
        }
    }
    public void checkBalance(){
        try {
            Thread.sleep(1000);
            System.out.println("Current Balance : "+account.getBalance());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}