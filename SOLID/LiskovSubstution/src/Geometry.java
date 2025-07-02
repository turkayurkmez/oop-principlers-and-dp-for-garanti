public class Geometry {

    public IGeometry CreateRectangle(int length){
        //... bir biçimde....
        Square square = new Square();
        square.setEdge(length);
        return  square;


    }

    public IGeometry CreateRectangle(int width, int height){
        //... bir biçimde....
        Rectangle rectangle = new Rectangle();
      rectangle.setWidth(width);
      rectangle.setHeight(height);
        return  rectangle;


    }
}
