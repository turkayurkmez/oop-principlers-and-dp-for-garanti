public class WindowsCheckBox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Checkbox, windows için oluşturuldu");
    }

    @Override
    public void toggle() {
        System.out.println("Windows Checkbox'u, seçim yapıldı ya da kaldırıldı :)");

    }
}

