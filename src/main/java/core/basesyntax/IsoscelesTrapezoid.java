package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(Color color, double base1, double base2, double height) {
        super(color);

        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {

        return ((base1 + base2) / 2.0) * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + String.format("%.2f", getArea())
                + " sq. units, base1: " + String.format("%.2f", base1)
                + " units, base2: " + String.format("%.2f", base2)
                + " units, height: " + String.format("%.2f", height)
                + " units, color: " + getColor();
    }
}
