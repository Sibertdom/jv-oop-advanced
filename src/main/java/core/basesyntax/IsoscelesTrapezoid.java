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

    @Override
    protected void printUniqueParameters() {
        System.out.printf(", base1: %.2f units, base2: %.2f units"
                        + ", height: %.2f units",
                base1, base2, height);
    }
}
