public class TwoHunderedTLHandler extends BanknotHandler{

    private final int DENOMINATION =200;
    private int stock;
    
    public TwoHunderedTLHandler(int stock){
        this.stock = stock;
    }
    
    
    
    @Override
    protected void process(WithdravalRequest request) {
        if (request.getRemainingAmount() >= DENOMINATION && stock >0){
            int needed = request.getRemainingAmount() / DENOMINATION;
            int minValue = Math.min(needed,stock);
            if (minValue > 0){
                stock -= minValue;
                request.addNote(DENOMINATION,minValue);
                request.setRemainingAmount(request.getRemainingAmount() - (DENOMINATION * minValue));
            }
            
            System.out.println("200 TL" + minValue + " adet verildi. Kalan tutar: " + request.getRemainingAmount() +" Banknot stoğu: "+stock);
        }
    }

    public int getStock() {
        return stock;
    }
}
