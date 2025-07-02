import java.time.LocalDate;
import java.util.List;

public class Report {
    private String title;

    private String chart;
    private List<String> data;


    public Report(ReportBuilder builder){
        title = builder.getTitle();
        chart = builder.getCharType();
        data = builder.getData();

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Başlık: ").append(title).append("\n");
        sb.append("Veri: ").append(data).append("\n");
        sb.append("Chart: ").append(chart).append("\n");

        return  sb.toString();
    }

    public String getTitle() {
        return title;
    }



    public String getChart() {
        return chart;
    }

    public List<String> getData() {
        return data;
    }


}
