package core.basesyntax;

// Припускаємо, що інтерфейси Drawable та AreaCalculator вже виправлені,
// згідно з попередніми вимогами ментора.
public abstract class Figure implements Drawable, AreaCalculator {

    // ЗМІНА 1: Тип поля змінено на String
    private String color;

    // ЗМІНА 2: Тип аргументу в конструкторі змінено на String
    public Figure(String color) {
        this.color = color;
    }

    // Тип повернення геттера також змінено на String
    public String getColor() {
        return color;
    }

    // Ці методи виглядають коректно
    public abstract double getArea();

    public abstract void draw();
}
