public class UpdateCustomerCommand implements Command{

    private DatabaseManager dbManager;
    private int id;
    private String name;
    private String oldName;

    public UpdateCustomerCommand(int id, DatabaseManager dbManager, String name) {
        this.id = id;
        this.dbManager = dbManager;
        this.name = name;
        this.oldName = "Old_"+name;
    }

    @Override
    public void execute() {
        dbManager.updateCustomer(id,name,"test");
        
    }

    @Override
    public void undo() {
       dbManager.updateCustomer(id,oldName,"test"); 
    }

    @Override
    public String getDescription() {
        return "Müşteri güncellendi: "+ id;
    }
}
