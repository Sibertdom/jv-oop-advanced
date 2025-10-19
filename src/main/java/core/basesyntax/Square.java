package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        // Площа квадрата: сторона * сторона
        return side * side;
    }

    @Override
    protected void printUniqueParameters() {
        System.out.printf(", side: %.2f units", side);
    }
}
