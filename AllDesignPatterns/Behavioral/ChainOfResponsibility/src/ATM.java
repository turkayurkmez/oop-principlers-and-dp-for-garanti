import java.io.InputStream;

import java.util.Map;

public class ATM {
    private BanknotHandler handlerChain;
    private TwoHunderedTLHandler handler200;
    private OneHunderTLHandler handler100;
    private FiftyTLHandler handler50;
    private TwentyTLHandler handler20;

    private void initializeHandlers(){
        handler200 = new TwoHunderedTLHandler(10);
        handler100 = new OneHunderTLHandler(15);
        handler50 = new FiftyTLHandler(20);
        handler20 = new TwentyTLHandler(20);


    }

    private void  buildChain(){
        handlerChain = handler200;
        handler200.setNext(handler100)
                  .setNext(handler50)
                  .setNext(handler20);

    }

    public  ATM(){
        initializeHandlers();
        buildChain();
    }

    public boolean withdrawMoney(int amount){
        if (amount<=0){
            System.out.println("yetersiz tutar");
            return false;
        }

        if (amount % 20 != 0){
            System.out.println("20'nin katı olmalı");
            return false;
        }

        WithdravalRequest request = new WithdravalRequest(amount);
        handlerChain.handle(request);

        if (request.isCompleted()){
            System.out.println("Ödeme başarılı");
            printProcess(request);
            return  true;
        }else{
            System.out.println("Makinede yeterli para yok!");

            printProcess(request);
            return false;
        }

    }

    private  void printProcess(WithdravalRequest request){
        System.out.println("Verilen banknotlar:");
        request.getNotes().entrySet().stream()
                .forEach(entry-> System.out.println(entry.getKey() + "TL  x " + entry.getValue() + "adet" ) );

        System.out.println("Ödeme toplamı: "+ request.getTotal());

    }


}
