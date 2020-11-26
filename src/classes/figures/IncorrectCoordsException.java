package classes.figures;

/**
 * Исключение, возникающее при попытке задать некорректные координаты фигур
 */
public class IncorrectCoordsException extends Exception {
    private int coord;

    public IncorrectCoordsException(String message, int coord) {
        super(message);
        this.coord = coord;
    }

    public int getCoord() {
        return coord;
    }
}
