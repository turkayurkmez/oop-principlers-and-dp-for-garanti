//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        *    Problem: cross-platform çalışan bir GUI tema inşa edilmek isteniyor. İşletim sistemi hedefleri: Windows ve Mac
        *    Hangi işletim sistemi seçildiyse UI bileşenleri ona göre oluşacak!
        *
        *    Button (Mac ve Windows)
        *    Checkbox
        *    TextField
        *
        *
        * */

        GUIFactory autoFactory = PlatformSelector.getFactory("windows");
        Application app = new Application(autoFactory);
        app.createUI();
        app.interactUI();

        GUIFactory autoFactory2 = PlatformSelector.getFactory("mac");
        Application app2 = new Application(autoFactory2);
        app2.createUI();
        app2.interactUI();

        GUIFactory winFactory = new WindowsFactory();
        Application winApp = new Application(winFactory);
        winApp.createUI();
        winApp.interactUI();
    }
}