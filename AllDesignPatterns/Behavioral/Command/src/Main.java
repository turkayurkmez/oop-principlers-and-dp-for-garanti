import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Problem:
           Bir uygulamada; kullanıcılar farklı ekranlardan sürekli veri ekleme
           güncelleme ya da silme işlemleri gerçekleştiriyorlar.

           * Hatalı işlemleri geri alabilmek
           * Toplu işlemleri sırayla çalıştırmak
           * Aynı işlemleri tekrar çalıştırmak
           * İşlem geçmişlerini loglamak

           Tüm bunları nasıl bir çözümle yönetirsiniz?


        * */

        DatabaseManager manager = new DatabaseManager();
        DatabaseInvoker invoker = new DatabaseInvoker();

        CreateCustomerCommand create1 = new CreateCustomerCommand(manager,"türkay","ab@test.com");
        CreateCustomerCommand create2= new CreateCustomerCommand(manager,"Derya","abc");
        UpdateCustomerCommand update1= new UpdateCustomerCommand(1,manager,"Mehmet");
        UpdateCustomerCommand update2= new UpdateCustomerCommand(2,manager,"abc");


        invoker.executeCommand(create1);
        invoker.executeCommand(create2);
        invoker.executeCommand(update1);

        invoker.showHistory();

        invoker.undo();
        invoker.undo();

        invoker.showHistory();

        List<Command> commands = Arrays.asList(
                new CreateCustomerCommand(manager,"Yeşim",""),
                new CreateCustomerCommand(manager,"Sibel","")



        );

        invoker.executeBatch(commands);

    }
}