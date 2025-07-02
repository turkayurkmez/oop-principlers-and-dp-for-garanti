import java.util.ArrayList;
import java.util.List;

public class ReportDirector {

    public Report createSalesReport(){

        List<String> data = new ArrayList<>();
        data.add("Veri1");
        data.add("Veri2");

        return new ReportBuilder("Satış Raporu",data,"Pasta").build();

    }

    public  Report createMarketingReport(){
        List<String> data = new ArrayList<>();
        data.add("MArket Veri1");
        data.add("Market Veri2");

        return new ReportBuilder("Pazarlama Raporu",data,"Bar").build();

    }
}
