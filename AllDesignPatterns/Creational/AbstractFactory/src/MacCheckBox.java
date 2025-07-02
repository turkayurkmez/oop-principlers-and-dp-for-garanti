public class MacCheckBox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Checkbox, Mac için oluşturuldu");
    }

    @Override
    public void toggle() {
        System.out.println("Mac Checkbox'u, seçim yapıldı ya da kaldırıldı :)");

    }
}
