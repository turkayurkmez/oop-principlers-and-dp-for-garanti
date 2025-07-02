public interface Payment {
    boolean validatePayment();
    boolean processTransaction(double amount);
    void sendConfirmation();
    String getPaymentType();

}

