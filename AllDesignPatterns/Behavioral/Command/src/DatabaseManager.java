//Receiver:
public class DatabaseManager {
    public void insertCustomer(String name, String email){
        System.out.println(name + " isimli müşteri db'ye eklendi");
    }
    public void updateCustomer(int id,String name, String email){
        System.out.println(id + " id'li müşteri güncellendi");
    }

    public void deleteCustomer(int id){
        System.out.println(id + " id'li müşteri silindi");
    }

}
