package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private static final int MAX_PROPERTY_VALUE = 10;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";

    public Figure getRandomFigure() {
        // Генеруємо випадкове число для вибору типу фігури (0, 1, 2)
        int figureType = random.nextInt(3);
        String color = colorSupplier.getRandomColor();
        double property1 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)
        double property2 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)

        switch (figureType) {
            case 0:
                // Квадрат (потрібна 1 властивість)
                return new Square(color, property1);
            case 1:
                // Коло (потрібна 1 властивість)
                return new Circle(color, property1);
            case 2:
                // Прямокутний трикутник (потрібні 2 властивості)
                return new RightTriangle(color, property1, property2);
            default:
                // Повертаємо дефолтну фігуру як запасний варіант
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        // Завжди повертає біле коло з радіусом 10
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
