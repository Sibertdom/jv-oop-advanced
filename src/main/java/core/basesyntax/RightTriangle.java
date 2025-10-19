package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        // Площа прямокутного трикутника: (a * b) / 2
        return (firstLeg * secondLeg) / 2.0;
    }

    // Імплементація методу draw() з інтерфейсу Drawable (через Figure).
    // Повертає повний рядок з інформацією про фігуру.
    @Override
    public String draw() {
        // Формуємо повний рядок:
        // Figure: righttriangle, area: X.XX sq. units,
        // firstLeg: Y.YY units, secondLeg: Z.ZZ units, color: AAA
        return "Figure: right triangle, area: " + String.format("%.2f", getArea())
                + " sq. units, firstLeg: " + String.format("%.2f", firstLeg)
                + " units, secondLeg: " + String.format("%.2f", secondLeg)
                + " units, color: " + getColor();
    }
}
