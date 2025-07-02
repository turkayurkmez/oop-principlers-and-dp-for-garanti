public class MacFactory implements GUIFactory
{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new MacTextField();
    }
}
