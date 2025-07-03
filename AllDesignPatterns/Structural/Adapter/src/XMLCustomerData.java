public class XMLCustomerData {

    //ADAPTEE: Adapte edilmlesini istediğiniz; uygulamayla UYUMSUZ olan yapı:
    private String xmlData;

    public XMLCustomerData(String xmlData) {
        this.xmlData = xmlData;
    }

    public String getXmlData(){
        return xmlData;
    }
}
