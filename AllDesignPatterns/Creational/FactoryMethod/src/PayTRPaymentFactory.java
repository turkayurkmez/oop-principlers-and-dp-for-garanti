public  class  PayTRPaymentFactory extends  PaymentFactory{
    
    private String email;
    public String password;

    public PayTRPaymentFactory(String email, String password) {
        this.email = email;
        this.password = password;
    }
 @Override
    public Payment createpayment(){
        return new PayTRPayment(email,password);
    }

    
}
