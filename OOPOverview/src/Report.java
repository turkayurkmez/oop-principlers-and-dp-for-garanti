import java.io.File;

public class Report {



    private  String format;
    private String excelFilePath;


    public Report(String excelFilePath){

        if (excelFilePath == null || excelFilePath == "" ){
            throw new  IllegalArgumentException("Excel dosyasını belirtin! ");
        }

        //dosya var mı?



        format = "PDF";

    }



    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void  CreateReport(){
        System.out.println("Rapor oluşturuldu...");
    }
}
