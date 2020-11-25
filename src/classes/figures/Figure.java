package classes.figures;

import java.awt.*;

public abstract class Figure {
    protected int id;
    protected int color;

    public Figure(int id) {
        this.id = id;
    }

    public abstract void paint(Graphics graph);

    public abstract double getPerimeter();

    public abstract double getSquare();

    public void printInfo() {
        System.out.println("Фигура: id = " + id);
    }
}
