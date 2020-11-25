package classes.figures;

import java.awt.*;

public abstract class Figure {
    protected int id;
    protected FigureColor color;

    public Figure(int id) {
        this.id = id;
        this.color = FigureColor.BLACK;
    }

    public abstract double getPerimeter();

    public abstract double getSquare();

    public void printInfo() {
        System.out.println("Фигура: id = " + id);
    }

    public FigureColor getColor() {
        return color;
    }

    public void setColor(FigureColor color) {
        this.color = color;
    }
}
