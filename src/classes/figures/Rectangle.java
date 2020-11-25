package classes.figures;

import java.awt.*;

/**
 * Прямоугольник.
 * Позволяет расчитать площадь и периметр
 * */
public class Rectangle extends Figure {
    /** координаты левого верхнего угла */
    private int x1 = 0, y1 = 0;
    private int x2, y2;

    /**
     * конструктор по умолчанию
     */
    public Rectangle(int id) {
        this(id, 0, 0);
    }

    public Rectangle(int id, int x2, int y2) {
        this(id, 0, 0, x2, y2);
    }

    /**
     * инициализация координат
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public Rectangle(int id, int x1, int y1, int x2, int y2) {
        super(id);

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        //super.id = 77;
    }

    @Override
    public void paint(Graphics graph) {
        graph.drawRect(x1, y1, x2-x1, y2-y1);
    }

    @Override
    public double getPerimeter() {
        return 0;
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
    @Override
    public double getSquare() {
        return getHeight() * getWidth();
    }

    /**
     * Вывод сведений
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Прямоугольник: x1 = " + x1);
    }
}
