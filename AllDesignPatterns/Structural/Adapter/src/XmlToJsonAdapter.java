public class XmlToJsonAdapter implements JsonDataProvider {


    private XMLCustomerData xmlCustomerData;

    public XmlToJsonAdapter(XMLCustomerData xmlCustomerData) {
        this.xmlCustomerData = xmlCustomerData;
    }



    @Override
    public String getJsonData() {
        String xml = xmlCustomerData.getXmlData();
        System.out.println("XML JSON'a dönüştürülüyor ");
        String json = "Json'a dönüştü "+ xml;
        return json;
    }
}
