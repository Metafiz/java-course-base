package classes.figures;

import java.awt.*;

public interface Drawable {
    int THIN = 1;
    int MEDIUM = 2;
    int THICK = 3;

    /**
     * отрисовывает объект на заданном холсте с заданной толщиной линии
     * @param graph холст
     * @param thickness толщина
     */
    public void paint(Graphics graph, int thickness);
}
