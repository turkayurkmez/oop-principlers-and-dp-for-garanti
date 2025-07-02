//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //Bir nesne, ..........gelişime................ açık, ......değişime........ kapalı olmalıdır.
        //Bir dükkanda; kampanya yapılıyor. Müşterilerin sadakat kartına göre; %5 %10 ve %15'lik indirim uygulanıyor.

         Customer customer = new Customer();
         customer.setCardType(new Premium());
         customer.setName("Türkay");

         OrderManager orderManager = new OrderManager();
         orderManager.setCustomer(customer);

         double price = orderManager.GetDiscountedPrice(1000);
         System.out.println(price);

    }
}