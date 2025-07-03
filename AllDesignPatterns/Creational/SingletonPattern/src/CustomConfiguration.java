public class CustomConfiguration {


    private int number;

    private static CustomConfiguration instance;
    public static CustomConfiguration createInstance(){
        if (instance == null){
          instance = new CustomConfiguration();
        }
        return  instance;
    }

    private CustomConfiguration(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
