public class WindowsFactory implements GUIFactory
{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}

