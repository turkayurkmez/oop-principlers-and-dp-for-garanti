public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShipmentService shipmentService;
    private EmailService emailService;

    public OrderFacade(){
        inventoryService =new InventoryService();
        paymentService = new PaymentService();
        shipmentService = new ShipmentService();
        emailService = new EmailService();
    }

    public boolean createOrder(String product, double amount){
        if (!inventoryService.checkStock(product)){
            System.out.println("stokta yok!");
            return false;
        }

        if (!paymentService.processPayment(amount)){
            System.out.println("ödeme yapılamadı!");
            return false;
        }

        shipmentService.processShipment();
        emailService.sendConfirmation("hede@hodo.com");
        System.out.println("Sipariş tamamlandı");

        return true;

    }
}
