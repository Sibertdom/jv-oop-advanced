package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_PROPERTY_VALUE = 10;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        Color color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double side = random.nextDouble() * MAX_PROPERTY_VALUE + 1;
                return new Square(color, side);
            case 1:
                double radius = random.nextDouble() * MAX_PROPERTY_VALUE + 1;
                return new Circle(color, radius);
            case 2:
                double base = random.nextDouble() * MAX_PROPERTY_VALUE + 1;
                double height = random.nextDouble() * MAX_PROPERTY_VALUE + 1;
                return new RightTriangle(color, base, height);
            case 3:
                double length = random.nextDouble() * MAX_PROPERTY_VALUE + 1;
                double width = random.nextDouble() * MAX_PROPERTY_VALUE + 1;
                return new Rectangle(color, length, width);
            case 4:
                double topBase = random.nextDouble() * MAX_PROPERTY_VALUE + 1;
                double bottomBase = random.nextDouble() * MAX_PROPERTY_VALUE + 1;
                double trapezoidHeight = random.nextDouble() * MAX_PROPERTY_VALUE + 1;
                return new IsoscelesTrapezoid(color, topBase, bottomBase, trapezoidHeight);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
