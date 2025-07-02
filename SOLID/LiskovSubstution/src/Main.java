//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Geometry geometry = new Geometry();
        IGeometry dortgen = geometry.CreateRectangle(8);

        System.out.println(dortgen.CalculateArea());
    }
}