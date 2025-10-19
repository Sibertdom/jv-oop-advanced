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

    @Override
    protected void printUniqueParameters() {
        System.out.printf(", firstLeg: %.2f units, secondLeg: %.2f units", firstLeg, secondLeg);
    }
}
