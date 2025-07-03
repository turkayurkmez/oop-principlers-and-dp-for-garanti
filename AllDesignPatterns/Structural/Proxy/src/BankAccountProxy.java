public class BankAccountProxy implements Account{

    private String accountNumber;
    private String password;
    private boolean isAuthorized = false;

    private BankAccount realAccount;

    public BankAccountProxy(String accNumber, String password) {
        this.accountNumber = accNumber;
        this.password = password;
    }

    private boolean checkAuthorization(){
        if (!isAuthorized){
            if (password.equals("123") && accountNumber.equals("111") ){
                isAuthorized = true;
                return  true;
            }
            else{
                System.out.println("Şifre hatalı!");
                isAuthorized =false;
                return  false;
            }
        }
        return isAuthorized;
    }

    @Override
    public void addMoney(double amount) {
        if (realAccount == null && checkAuthorization()){
            realAccount = new BankAccount(this.accountNumber);
            realAccount.addMoney(amount);
        }
    }

    @Override
    public void getMoney(double amount) {
        if (checkAuthorization()){
            realAccount = new BankAccount(this.accountNumber);
            realAccount.getMoney(amount);
        }
    }


}
