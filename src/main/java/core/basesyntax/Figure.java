package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculatable {

    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract String draw();
}
