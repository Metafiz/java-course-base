package classes.figures;

import java.awt.*;

public class Circle extends Figure implements Drawable {
    private int x, y, r=5;

    public Circle(int id) {
        super(id);
    }

    @Override
    public void paint(Graphics graph, int thickness) {
        switch (this.color) {
            case BLACK -> graph.setColor(Color.BLACK);
            case BLUE -> graph.setColor(Color.BLUE);
            case RED -> graph.setColor(Color.RED);
            default -> graph.setColor(Color.BLACK);
        }
        // задаём толщину
        ((Graphics2D)graph).setStroke(new BasicStroke(thickness) );
        graph.drawOval(x - r, y - r, r, r);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public Circle(int id, int x, int y, int r) {
        super(id);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public double getSquare() {
        return  (Math.PI * r *r);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Круг: r = " + r);
    }

    public double getLength() {
        return  (2 * Math.PI * r);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        assert r > 0 : "Радиус не может быть отрицательным!";
        this.r = r;
    }
}
