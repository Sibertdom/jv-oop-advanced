package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];

        // Кількість випадкових та дефолтних фігур
        int halfSize = ARRAY_SIZE / 2;

        // 1. Перша половина: Випадкові фігури
        System.out.println("--- GENERATING RANDOM FIGURES ---");
        for (int i = 0; i < halfSize; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        // 2. Друга половина: Дефолтні фігури
        System.out.println("--- GENERATING DEFAULT FIGURES ---");
        for (int i = halfSize; i < ARRAY_SIZE; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        // 3. Виведення всього масиву за допомогою поліморфізму
        System.out.println("\n--- DISPLAYING ALL FIGURES ---");
        for (Figure figure : figures) {
            // Завдяки поліморфізму, ми викликаємо загальний метод draw(),
            // але виконується реалізація конкретного підкласу (Square, Circle, etc.)
            figure.draw();
        }
    }
}
