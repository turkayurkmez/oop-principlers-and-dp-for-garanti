public abstract class PaymentFactory {
    //Bu nesnenin görevi; kullanılacak ödeme nesnesini belirlemek!!!!

    public  abstract  Payment createpayment();

    public  boolean executePayment(double amount){
        Payment payment = createpayment();

        System.out.println("İşlem başlıyor");
        if (!payment.validatePayment()){
            System.out.println("Ödeme doğrulanamadı");
        }

        if (!payment.processTransaction(amount)){
            System.out.println("İşlem başarısız");
        }

        payment.sendConfirmation();
        System.out.println("Ödeme başarılı");

        return  true;



    }



}



