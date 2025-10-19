package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = {"red", "green", "blue", "yellow", "purple", "orange"};
    private final Random random = new Random();

    public String getRandomColor() {
        // Вибираємо випадковий колір з масиву
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
