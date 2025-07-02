public class CreditCardPayment implements Payment{

    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String expiryDate, String cvv, String cardNumber) {
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardNumber = cardNumber;

    }



    @Override
    public boolean validatePayment() {
        //kredi kartı denetleme işlemleri....
        return true;
    }

    @Override
    public boolean processTransaction(double amount) {
        //ödeme işlemleri....
        return true;
    }

    @Override
    public void sendConfirmation() {
        //SMS gönderme işlemi...
    }

    @Override
    public String getPaymentType() {
        return "Credit Card";
    }
}
