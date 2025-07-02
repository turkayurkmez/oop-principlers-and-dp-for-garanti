public class PlatformSelector {
    public static  GUIFactory getFactory(String operationSystem){
        if (operationSystem.contains("win")){
            System.out.println("Windows algılandı");
            return new WindowsFactory();
        }
        else if(operationSystem.contains("mac")){
            System.out.println("mac algılandı");
            return  new MacFactory();


        }
        else{
            System.out.println("Algılanamadı. Windows varsayılan olarak kullanılıyor.");
            return new WindowsFactory();
        }
    }
}
