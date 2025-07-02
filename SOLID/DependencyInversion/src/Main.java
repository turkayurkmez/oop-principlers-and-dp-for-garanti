//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WhatsAppSender whatsAppSender = new WhatsAppSender();
        TelegramSender telegramSender = new TelegramSender();
        MailSender mailSender = new MailSender();

        ReportPublisher publisher = new ReportPublisher(whatsAppSender);

        publisher.Send();


    }
}