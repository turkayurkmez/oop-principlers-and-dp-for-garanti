
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.


            Product mouse  = new Product();
            mouse.name = "Logitech MX 3";


            Product keyboard = new Product();
            keyboard.name ="Bişeyb,şey";

            Product another = mouse;
            another.name ="Everest";

            System.out.println(mouse.name);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ürün fiyatını girin:");

        double price = scanner.nextDouble();

        /*
        if (price < 0){
            throw new IllegalArgumentException("Fiyat negatif olamaz");
        }*/

        Product p1 = new Product();
        p1.setPrice(5);

        Report report = new Report("C:\\data.xslx");

        System.out.println(report.getFormat());




        EtYemek kofte = new EtYemek();
        SebzeYemek mantarSote = new SebzeYemek();
        Tatli tulumba = new Tatli();




        Asci asci = new Asci();

        asci.Pisir(kofte);
        asci.Pisir(mantarSote);
        asci.Pisir(tulumba);

        WordDocument sozlesme = new WordDocument();
        ExcelDocument satisRapor = new ExcelDocument();
        PDFDocument oryantasyon = new PDFDocument();

        PrinterComponent printerComponent = new PrinterComponent();
        printerComponent.Print(sozlesme);
        printerComponent.Print(satisRapor);
        //printerComponent.Print(oryantasyon);









    }
}