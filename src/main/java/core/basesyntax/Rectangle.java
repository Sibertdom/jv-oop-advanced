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
        return width * length;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + String.format("%.2f", getArea())
                + " sq. units, width: " + String.format("%.2f", width)
                + " units, length: " + String.format("%.2f", length)
                + " units, color: " + getColor();
    }
}
