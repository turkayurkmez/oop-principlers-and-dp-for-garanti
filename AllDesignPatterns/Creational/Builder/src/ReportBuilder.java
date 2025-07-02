import java.time.LocalDate;
import java.util.List;

public  class ReportBuilder {
    //Zorunlu alanlar:
    private final String title;
    private final List<String> data;

    private final String chartType;


    public String getTitle() {
        return title;
    }

    public List<String> getData() {
        return data;
    }



    public String getCharType() {
        return chartType;
    }




    public ReportBuilder(String title, List<String> data, String chartType) {
        this.title = title;
        this.data = data;
        this.chartType = chartType;
    }


    //opsiyonel:

    private List<String> authors;

    public Report build(){
        return  new Report(this);
    }

}
