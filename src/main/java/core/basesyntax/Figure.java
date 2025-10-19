package core.basesyntax;

// Figure тепер імплементує обидва інтерфейси
public abstract class Figure implements Drawable, AreaCalculatable {

    private String color;

    // Конструктор
    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Успадковано від AreaCalculatable (збереглося без змін)
    @Override
    public abstract double getArea();

    // Успадковано від Drawable (збереглося без змін)
    @Override
    public abstract String draw();
}
