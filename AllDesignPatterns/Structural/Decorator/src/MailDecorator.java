public  abstract  class  MailDecorator implements Mail{

    protected Mail wrappedMail;

    public MailDecorator(Mail wrappedMail) {
        this.wrappedMail = wrappedMail;
    }

    @Override
    public void Send(){
        wrappedMail.Send();
    }

    @Override
    public String getContent(){
        return wrappedMail.getContent();
    }
}

