public class Square implements IGeometry { //extends Rectangle

   private int edge;


    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;

    }

    public double CalculateArea(){
        return edge * edge;
    }
}