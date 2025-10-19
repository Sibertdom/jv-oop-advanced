package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // Площа кола: π * r²
        return Math.PI * radius * radius;
    }

    // Тепер цей метод імплементує абстрактний метод draw() з Figure
    // і повертає рядок з усією інформацією.
    @Override
    public String draw() {
        // Формуємо повний рядок:
        // Figure: circle, area: X.XX sq. units, radius: Y.YY units, color: ZZZ
        return "Figure: circle, area: " + String.format("%.2f", getArea())
                + " sq. units, radius: " + String.format("%.2f", radius)
                + " units, color: " + getColor();
    }
}
