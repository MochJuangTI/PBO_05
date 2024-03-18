import Circle.Circle;
import Triangle.*;

public class Main {
    public static void main(String[] args) throws Exception {
        RightTriangle ABC = new RightTriangle("ABC", 3.0, 4.0);
        ABC.spesificMethod();

        Triangle BCD = new RightTriangle("BCD", 3.0, 4.0);
        BCD.hallo();

        Triangle CDE = new Triangle("CDE", 3.0, 4.5, 4.0);
        CDE.hallo();
    }
}