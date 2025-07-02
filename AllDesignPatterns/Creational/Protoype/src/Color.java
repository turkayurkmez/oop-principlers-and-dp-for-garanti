public class Color implements ColorPrototype{

    private int red;
    private int green;

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    private int blue;

    public Color() throws InterruptedException {
        this.red = 0;
        blue=0;
        green =0;

        System.out.println("Constructor sadece 1 kere çalışacak");

        Thread.sleep(2500);
    }


    @Override
    public String toString() {
        return this.red + " " + this.green + " " + this.blue;
    }

    @Override
    public ColorPrototype clone() {

        try {
            return  (Color)super.clone();

        } catch (CloneNotSupportedException e) {
            Color color = null;
            try {
                color = new Color();
                color.green = this.green;
                color.blue = this.blue;
                color.red = this.red;

                return  color;
            } catch (InterruptedException ex) {
               return null;
            }



        }

    }
}
