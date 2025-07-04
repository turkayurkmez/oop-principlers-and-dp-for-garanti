public abstract class BanknotHandler  {

    private BanknotHandler nextHandler;

    public BanknotHandler setNext(BanknotHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public void handle(WithdravalRequest request){
        process(request);

        if (!request.isCompleted() && nextHandler != null){
            nextHandler.handle(request);
        }
    }

    protected  abstract  void  process(WithdravalRequest request);


}


