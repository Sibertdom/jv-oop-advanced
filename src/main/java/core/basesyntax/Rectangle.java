package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(Color color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        // Площа прямокутника: width * length
        return width * length;
    }

    // Імплементація методу draw() з інтерфейсу Drawable (через Figure).
    // Повертає повний рядок з інформацією про фігуру.
    @Override
    public String draw() {
        // Формуємо повний рядок: Figure: rectangle, area: X.XX sq. units,
        // width: Y.YY units, length: Z.ZZ units, color: AAA
        return "Figure: rectangle, area: " + String.format("%.2f", getArea())
                + " sq. units, width: " + String.format("%.2f", width)
                + " units, length: " + String.format("%.2f", length)
                + " units, color: " + getColor();
    }
}
