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

    @Override
    protected void printUniqueParameters() {
        System.out.printf(", radius: %.2f units", radius);
    }
}
