package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        // Площа прямокутника: width * length
        return width * length;
    }

    @Override
    protected void printUniqueParameters() {
        System.out.printf(", width: %.2f units, length: %.2f units", width, length);
    }
}
