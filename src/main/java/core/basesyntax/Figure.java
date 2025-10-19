package core.basesyntax;

public abstract class Figure {
    // Спільний стан (Field)
    private String color;

    // Конструктор
    public Figure(String color) {
        this.color = color;
    }

    // Абстрактна поведінка (для обчислення площі, реалізується в підкласах)
    public abstract double getArea();

    // Реалізована поведінка (для виведення інформації)
    public void draw() {
        System.out.print("Figure: " + this.getClass().getSimpleName().toLowerCase());
        System.out.printf(", area: %.2f sq. units", getArea());
        System.out.println(", color: " + color);

        // Виклик методу для виведення унікальних параметрів
        printUniqueParameters();
    }

    // Абстрактний метод для виведення унікальних параметрів фігури
    protected abstract void printUniqueParameters();

    // Геттер для кольору (корисний для логіки)
    public String getColor() {
        return color;
    }
}
