public class CustomerService  {
    public void processCustomer(JsonDataProvider provider){
        String jsonData = provider.getJsonData();
        System.out.println("JSON data işlendi: " + jsonData);
    }
}
