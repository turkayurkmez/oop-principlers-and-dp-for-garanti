public class BankAccount implements  Account{

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        //db'den çekildiğini düşünün:
        this.balance = 150000;
        System.out.println("bakiye yüklendi");
    }

    @Override
    public void addMoney(double amount) {
        balance += amount;
        System.out.println(amount + " TL Yatırıldı");
    }

    @Override
    public void getMoney(double amount) {
        balance -= amount;
        System.out.println(amount + " TL çekildi");

    }
}
