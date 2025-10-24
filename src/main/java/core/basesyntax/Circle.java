package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + String.format("%.2f", getArea())
                + " sq. units, radius: " + String.format("%.2f", radius)
                + " units, color: " + getColor();
    }
}
