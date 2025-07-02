public class ReportPublisher {

//    public MailSender getMailSender() {
//        return mailSender;
//    }

//    public void setMailSender(MailSender mailSender) {
//        this.mailSender = mailSender;
//    }

    private Sender sender;

    public ReportPublisher(Sender sender){
        this.sender =sender;
    }



    public void Send (){
        //MailSender mailSender = new MailSender();
        sender.Send();
    }
}

