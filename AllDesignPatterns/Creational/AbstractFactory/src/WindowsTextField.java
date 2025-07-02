public class WindowsTextField implements TextField {
    @Override
    public void render() {
        System.out.println("TextField, windows için oluşturuldu");
    }

    @Override
    public void setText(String text) {
        System.out.println("Windows Textfield'ına, "+ text + " değeri atandı");
        
    }


}


