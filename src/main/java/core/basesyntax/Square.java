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

    // Імплементація методу draw() з інтерфейсу Drawable (через Figure).
    // Повертає повний рядок з інформацією про фігуру.
    @Override
    public String draw() {
        // Формуємо повний рядок:
        // Figure: square, area: X.XX sq. units, side: Y.YY units, color: ZZZ
        return "Figure: square, area: " + String.format("%.2f", getArea())
                + " sq. units, side: " + String.format("%.2f", side)
                + " units, color: " + getColor();
    }
}
