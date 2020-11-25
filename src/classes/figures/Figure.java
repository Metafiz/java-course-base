package classes.figures;

public class Figure {
    protected int id;
    protected int color;

    public Figure(int id) {
        this.id = id;
    }

    public double getPerimeter() {
        return -1;
    }

    public double getSquare() {
        return -1;
    }

    public void printInfo() {
        System.out.println("Фигура: id = " + id);
    }
}
