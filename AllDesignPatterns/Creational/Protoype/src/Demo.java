public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Color black = new Color();
        Color red = (Color) black.clone();
        red.setRed(255);

        Color green = (Color)black.clone();
        green.setGreen(255);

        Color blue = (Color)black.clone();
        blue.setBlue(255);

        Color white = (Color)blue.clone();
        white.setGreen(255);
        white.setRed(255);


        System.out.println(black);

        System.out.println(red);

        System.out.println(green);
        System.out.println(blue);
        System.out.println(white);









    }
}
