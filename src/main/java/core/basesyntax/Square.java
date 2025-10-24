package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + String.format("%.2f", getArea())
                + " sq. units, side: " + String.format("%.2f", side)
                + " units, color: " + getColor();
    }
}
