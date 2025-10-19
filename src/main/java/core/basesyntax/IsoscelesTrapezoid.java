package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        // Основа1 має бути меншою, ніж Основа2 для логічності,
        // але для обчислення площі порядок не важливий.
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        // Площа трапеції: ((base1 + base2) / 2) * height
        return ((base1 + base2) / 2.0) * height;
    }

    // Імплементація методу draw() з інтерфейсу Drawable (через Figure).
    // Повертає повний рядок з інформацією про фігуру.
    @Override
    public String draw() {
        // Формуємо повний рядок: Figure: isoscelestrapezoid, area: X.XX sq. units, ... color: ZZZ
        return "Figure: isosceles trapezoid, area: " + String.format("%.2f", getArea())
                + " sq. units, base1: " + String.format("%.2f", base1)
                + " units, base2: " + String.format("%.2f", base2)
                + " units, height: " + String.format("%.2f", height)
                + " units, color: " + getColor();
    }
}
