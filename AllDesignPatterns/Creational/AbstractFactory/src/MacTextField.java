public class MacTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Checkbox, mac için oluşturuldu");
    }

    @Override
    public void setText(String text) {
        System.out.println("Mac Textfield'ına, "+ text + " değeri atandı");

    }


}
