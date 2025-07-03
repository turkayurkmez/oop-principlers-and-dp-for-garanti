public class JsonCustomerService implements JsonDataProvider {

    private String jsonData;

    public JsonCustomerService(String jsonData) {
        this.jsonData = jsonData;
    }

    @Override
    public String getJsonData() {
        return jsonData;
    }
}
