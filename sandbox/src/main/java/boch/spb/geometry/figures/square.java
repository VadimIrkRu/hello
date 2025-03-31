package boch.spb.geometry.figures;

public class square {
    public static void printSquareArea(double side) {
        String text = String.format("Площадь квадрата со стороной %f = %f", side, squareArea(side));
        System.out.println(text);
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
