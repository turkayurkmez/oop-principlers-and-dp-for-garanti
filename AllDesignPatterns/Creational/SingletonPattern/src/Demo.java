public class Demo {
    public static void main(String[] args){
        CustomConfiguration configuration = CustomConfiguration.createInstance();

        configuration.setNumber(45);

        CustomConfiguration conf2 = CustomConfiguration.createInstance();
        System.out.println(conf2.getNumber());



    }
}
