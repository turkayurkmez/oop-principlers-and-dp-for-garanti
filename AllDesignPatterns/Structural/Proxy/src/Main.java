public class Main {
    public static void main(String[] args) {

        Account proxyAccount = new BankAccountProxy("111","123");
        proxyAccount.addMoney(250);
        proxyAccount.getMoney(300);

        Account proxy2 = new BankAccountProxy("111", "abc");
        proxy2.addMoney(450);
        proxy2.getMoney(500);


    }
}