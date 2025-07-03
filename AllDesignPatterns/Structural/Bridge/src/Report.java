public abstract class Report {
    protected  ReportFormatter formatter;

    public ReportFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(ReportFormatter formatter) {
        this.formatter = formatter;
    }

    public String generateReport(){
        String result = "Rapor tamamlandı";
        result += formatter.getResult();
        return  result;
    }
}

