//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentFactory creditPayment = createPaymentFactory("creditcard");
        creditPayment.executePayment(1000);

        PaymentFactory paytr = createPaymentFactory("paytr");
        paytr.executePayment(1000);


    }

    static PaymentFactory createPaymentFactory(String paymentType){
        switch (paymentType.toLowerCase()){
            case "creditcard":
                return new CreditCardPaymentFactory("1111","111","1/7/2025");
            case  "paytr":
                return new PayTRPaymentFactory("a@b.com","1111");
            default:
                return null;

        }
    }
}