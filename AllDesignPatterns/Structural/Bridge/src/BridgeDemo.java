

public class BridgeDemo {
    public  static  void  main(String[] args){
        //Problem: Bir class tasarımınında "has a" olması gereken ilişki "is a" ilişkisi olarak tanımlanırsa miras kaosu denilen sorun oluşur.
        //Bu sorunu bridge ile çözeriz.

        MarketingReport marketingReport = new MarketingReport();
        marketingReport.formatter = new PDFReportFormatter();

        String report1 = marketingReport.generateReport();
        System.out.println(report1);

        marketingReport.formatter = new MarkdownFormatter();
        String report2 = marketingReport.generateReport();
        System.out.println(report2);




    }
}
