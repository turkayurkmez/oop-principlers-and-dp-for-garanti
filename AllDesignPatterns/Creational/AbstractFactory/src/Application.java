public class Application {
    GUIFactory factory;
    Button button;
    Checkbox checkbox;
    TextField textField;

    public  Application(GUIFactory factory){
        this.factory = factory;
    }

    public void createUI(){

        System.out.println("arayüz oluşturuluyor....");
        button = factory.createButton();
        checkbox = factory.createCheckBox();
        textField = factory.createTextField();

        button.render();
        checkbox.render();
        textField.render();


    }

    public void  interactUI(){
        checkbox.toggle();
        textField.setText("Selam :)");
        button.onClick();
    }
}
