import java.util.Calendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Paragraf\n");
        sb.append("Alt başlık\n");

        System.out.println(sb.toString());

        /*
          Senaryo: Çok aşamadan oluşan detaylı bir rapor oluşturmanız gerekiyor.
              - Başlık
              - Veriler
              - Grafikler
              - Paydaşlar...


        * */

        ReportDirector director = new ReportDirector();
        Report salesReport = director.createSalesReport();
        System.out.println(salesReport);

        Report marketing = director.createMarketingReport();
        System.out.println(marketing);


        String[] items = {"A","B","C"};
        String[] clone = items.clone();

        items[0] = "Z";
        System.out.println(clone[0]);

    }
}