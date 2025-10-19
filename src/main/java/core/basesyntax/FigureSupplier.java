package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PROPERTY_VALUE = 10;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        // Генеруємо випадкове число для вибору типу фігури (0 до 4, тобто 5 типів)
        int figureType = random.nextInt(5);

        String color = colorSupplier.getRandomColor();
        // Генеруємо властивості, які можуть знадобитися
        double property1 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)
        double property2 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)
        double property3 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)

        switch (figureType) {
            case 0:
                // Квадрат (потрібна 1 властивість: side)
                return new Square(color, property1);
            case 1:
                // Коло (потрібна 1 властивість: radius)
                return new Circle(color, property1);
            case 2:
                // Прямокутний трикутник (потрібні 2 властивості: firstLeg, secondLeg)
                return new RightTriangle(color, property1, property2);
            case 3:
                // Прямокутник (потрібні 2 властивості: width, length)
                return new Rectangle(color, property1, property2);
            case 4:
                // Рівнобічна трапеція (потрібні 3 властивості: base1, base2, height)
                return new IsoscelesTrapezoid(color, property1, property2, property3);
            default:
                // Це не має статися, оскільки nextInt(5) дає 0-4
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        // Завжди повертає біле коло з радіусом 10
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}