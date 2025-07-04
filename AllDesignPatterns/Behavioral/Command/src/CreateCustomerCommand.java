public class CreateCustomerCommand implements Command{

    private DatabaseManager dbManager;
    private String name;
    private String email;
    private int generatedId;

    public CreateCustomerCommand(DatabaseManager dbManager, String name, String email) {
        this.dbManager = dbManager;
        this.name = name;
        this.email = email;
    }



    @Override
    public void execute() {
        dbManager.insertCustomer(name,email);
        generatedId = (int)(Math.random()*1000);
        System.out.println("Müşteri eklendi. ID: "+generatedId);
    }

    @Override
    public void undo() {
        dbManager.deleteCustomer(generatedId);
        System.out.println("Müşteri silindi. ID: "+generatedId);



    }

    @Override
    public String getDescription() {
        return "Müşteri Ekleme işlemi:" + name;
    }
}
