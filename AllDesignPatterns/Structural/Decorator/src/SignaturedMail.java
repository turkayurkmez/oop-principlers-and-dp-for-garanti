public  class SignaturedMail extends  MailDecorator{

    public SignaturedMail(Mail wrappedMail) {
        super(wrappedMail);
    }
    
    private String signature;
    
    

    @Override
    public String getContent() {
        return super.getContent() + " " + signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public void Send() {
        System.out.println("İmzalandı ve gönderildi");
        super.Send();
    }
}
