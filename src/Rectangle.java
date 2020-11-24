/**
 * Прямоугольник.
 * Позволяет расчитать площадь и периметр
 * */
public class Rectangle {
    /** координаты левого верхнего угла */
    public int x1 = 0, y1 = 0;
    public int x2, y2;

    /**
     * Расчёт ширины
     * @return ширина
     */
    public int getWidth() {
        return Math.abs(x2 - x1);
    }

    /**
     * Расчёт высоты
     * @return высота
     */
    public int getHeight() {
        return Math.abs(y2 - y1);
    }

    /**
     * Вывод сведений
     */
    public void printInfo() {
        System.out.println("Прямоугольник: x1 = " + x1);
    }
}
