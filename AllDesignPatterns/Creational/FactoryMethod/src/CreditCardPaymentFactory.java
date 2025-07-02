public  class CreditCardPaymentFactory extends   PaymentFactory{

    
    private String creditCardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPaymentFactory(String creditCardNumber, String cvv, String expiryDate) {
        this.creditCardNumber = creditCardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public Payment createpayment() {
        return new CreditCardPayment(expiryDate,cvv,creditCardNumber);
    }
}
