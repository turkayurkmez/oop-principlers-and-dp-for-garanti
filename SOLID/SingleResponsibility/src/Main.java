//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

/*
    static void CreateProduct(String name, double price){
        System.out.println(name + " isimli ürün eklendi");
    }

    static void UpdateProduct(String name, double price){
        System.out.println(name + " isimli ürün güncellendi");
    }
 */



    static void  ChangeBackgroundColor(){
        System.out.println(" renk değişti");

    }

    public static void main(String[] args) {
       //Tek sorumluluk prensibi: Bir nesnenin sadece bir sorumluluğu
        ProductService service = new ProductService();
        service.CreateProduct("Kupa",120);

    }
}