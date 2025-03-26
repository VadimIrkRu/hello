package boch.spb.geometry.figures;

public class square {
    public static void printSquareArea(double side) {System.out.println("Площадь квадрата со стороной " + side + " равен " + squareArea(side));
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
