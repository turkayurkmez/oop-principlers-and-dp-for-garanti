import java.io.*;
import java.util.Arrays;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args){
        /*
          Problem: Eski bir servisten müşteri bilgilerini XML ile alıyorsunuz; modern bir servisten ise JSON olarak

                   Oysa uygulamanız JSON ile çalışıyor.

                   Bu durumda uygulamanızda veriyi yeniden-kullanılabilir hale getirmek için ne yapmalısınız?

        * */

        CustomerService customerService = new CustomerService();

        XMLCustomerData xmlCustomerData = new XMLCustomerData("<xml>salladım</xml>");
        JsonDataProvider xmlAdapter = new XmlToJsonAdapter(xmlCustomerData);
        customerService.processCustomer(xmlAdapter);

        JsonDataProvider json = new JsonCustomerService("{name:'Test'}");
        customerService.processCustomer(json);
        // JAVA içerisindeki adapter pattern kullanılan yerler:
//        String[] array = {"a","b","c"};
//        List<String> list = Arrays.asList(array); // Adaptör!!!
//
//        try {
//            InputStream  inputStream = new FileInputStream("file.txt");
//            Reader reader = new InputStreamReader(inputStream); //Adaptör!!!
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
