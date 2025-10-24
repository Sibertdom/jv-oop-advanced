package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];

        int halfSize = ARRAY_SIZE / 2;

        System.out.println("--- GENERATING RANDOM FIGURES ---");
        for (int i = 0; i < halfSize; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        System.out.println("--- GENERATING DEFAULT FIGURES ---");
        for (int i = halfSize; i < ARRAY_SIZE; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        System.out.println("\n--- DISPLAYING ALL FIGURES ---");
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
