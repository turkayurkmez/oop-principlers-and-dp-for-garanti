public class Rectangle implements IGeometry {
    private int width;
    private int height;

    public  int getWidth() {
        return width;
    }

    public  void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double CalculateArea(){
        return width * height;
    }
}
