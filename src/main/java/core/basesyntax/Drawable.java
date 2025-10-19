package core.basesyntax;


public interface Drawable {

    // Метод для обчислення площі, спільний для всіх фігур
    double getArea();

    // Метод для "малювання" (виведення інформації), спільний для всіх фігур
    String draw();
}
