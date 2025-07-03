public class EncrypedMail extends  MailDecorator{

    public EncrypedMail(Mail wrappedMail) {
        super(wrappedMail);
    }

    @Override
    public String getContent() {
        return "Şifrelend: " + super.getContent();
    }

    @Override
    public void Send() {
        System.out.println("Eposta şifrelenerek gönderildi");
        super.Send();
    }
    
    
}
