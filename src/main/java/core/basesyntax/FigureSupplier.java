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

        double property1 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)
        double property2 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)
        double property3 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)

        switch (figureType) {
            case 0:
                return new Square(color, property1);
            case 1:
                return new Circle(color, property1);
            case 2:
                return new RightTriangle(color, property1, property2);
            case 3:
                return new Rectangle(color, property1, property2);
            case 4:
                return new IsoscelesTrapezoid(color, property1, property2, property3);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
