package core.basesyntax;

// Клас тепер імплементує інтерфейс Drawable
public abstract class Figure implements Drawable {
    // Спільний стан (Field)
    private String color;

    // Конструктор
    public Figure(String color) {
        this.color = color;
    }

    // Абстрактний метод з інтерфейсу Drawable. Реалізується в підкласах.
    @Override
    public abstract double getArea();

    // Абстрактний метод з інтерфейсу Drawable.
    // Реалізується в підкласах для формування рядка з усією інформацією.
    @Override
    public abstract String draw();

    // Геттер для кольору (корисний для логіки)
    public String getColor() {
        return color;
    }
}
