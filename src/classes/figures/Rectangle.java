package classes.figures;

/**
 * Прямоугольник.
 * Позволяет расчитать площадь и периметр
 * */
public class Rectangle {
    /** координаты левого верхнего угла */
    private int x1 = 0, y1 = 0;
    private int x2, y2;

    /**
     * конструктор по умолчанию
     */
    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(int x2, int y2) {
        this(0, 0, x2, y2);
    }

    /**
     * инициализация координат
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (x1 >= 0 && x1 <= 640 ) {
            this.x1 = x1;
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if (y1 >= 0 && y1 <= 480 ) {
            this.y1 = y1;
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

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
     * Расчёт площади
     * @return площадь
     */
    public int getSquare() {
        return getHeight() * getWidth();
    }

    /**
     * Вывод сведений
     */
    public void printInfo() {
        System.out.println("Прямоугольник: x1 = " + x1);
    }
}
