package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + String.format("%.2f", getArea())
                + " sq. units, firstLeg: " + String.format("%.2f", firstLeg)
                + " units, secondLeg: " + String.format("%.2f", secondLeg)
                + " units, color: " + getColor();
    }
}
