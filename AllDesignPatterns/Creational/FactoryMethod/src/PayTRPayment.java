public class PayTRPayment  implements  Payment{


    private String email;
    private String password;

    public PayTRPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean validatePayment() {

        return true;
    }

    @Override
    public boolean processTransaction(double amount) {
        return true;

    }

    @Override
    public void sendConfirmation() {

    }

    @Override
    public String getPaymentType() {
        return "PayTR";
    }
}
