package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5; // Кількість різних типів фігур
    private static final int MAX_PROPERTY_VALUE = 10;
    private static final double DEFAULT_RADIUS = 10.0;
    // Оновлення 1: Використовуємо Color enum для константи
    private static final Color DEFAULT_COLOR = Color.WHITE; // Припускаємо, що у вас є WHITE у Color enum

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        // Оновлення 2: Отримуємо об'єкт Color
        Color color = colorSupplier.getRandomColor();

        // Генеруємо властивості
        double property1 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)
        double property2 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)
        double property3 = random.nextDouble() * MAX_PROPERTY_VALUE + 1; // [1, 11)

        switch (figureType) {
            case 0:
                // Припускаємо, що конструктори фігур приймають Color
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
        // Оновлення 3: Використовуємо константу Color
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}