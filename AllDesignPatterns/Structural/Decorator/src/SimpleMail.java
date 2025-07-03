public class SimpleMail implements Mail{

    
    private String content;
    private String recipient;

    public SimpleMail(String content, String recipient) {
        this.content = content;
        this.recipient = recipient;
    }

    @Override
    public void Send() {
        System.out.println(recipient + " alıcısına mail gönderildi");
        System.out.println("İçerik: " + getContent());
    }

    @Override
    public String getContent() {
        return content;
    }
}
