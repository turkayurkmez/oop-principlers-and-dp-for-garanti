public class Main {
    public static void main(String[] args) {
        /*
        Aynı amaca yönelik birden fazla nesneyi; nasıl koordine edersiniz?
        Senaryo: ATM'den para çekme: Her nesne, belirli banknot yuvasından sorumlu.
        Zinciri nasıl kararız?
        * */

        ATM atm = new ATM();

        testWithdraw(atm,540);
        testWithdraw(atm,1500);
        testWithdraw(atm,35);
        testWithdraw(atm,80);


    }

    static void testWithdraw(ATM atm, int amount){
        System.out.println(amount + " TL  çekme işlemi");
        atm.withdrawMoney(amount);
        System.out.println();

    }
}