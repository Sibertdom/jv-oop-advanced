package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    // 1. Використовуємо масив значень з нашого ENUM
    private final Color[] colors = Color.values();
    private final Random random = new Random();

    public Color getRandomColor() {
        // 2. Генеруємо випадковий індекс для вибору кольору з масиву ENUM
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}
