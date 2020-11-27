package ui;

import classes.figures.Circle;
import classes.figures.Drawable;
import classes.figures.FigureColor;
import classes.figures.Rectangle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton btnAddRect;
    private JButton btnAddCircle;
    private JPanel paintPanel;
    private JButton btnPaintAll;

    public MainForm() {
        setContentPane(rootPanel);
        setVisible(true);

        this.setSize(800, 600);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btnAddCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circle c = new Circle(1, 300, 200, 80);
                c.setColor(FigureColor.RED);
                c.paint(paintPanel.getGraphics(), Drawable.MEDIUM);
            }
        });

        btnAddRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //drawRect();
                final JFileChooser fc = new JFileChooser();
                if (true) {
                    int returnVal = fc.showOpenDialog(MainForm.this);

                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        File file = fc.getSelectedFile();
                        //This is where a real application would open the file.
                        System.out.println("Opening: " + file.getAbsolutePath() + ".\n");
                    } else {
                        System.out.println("Open command cancelled by user.\n");
                    }
                }
            }
        });

        btnPaintAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // создаём массив ссылок на интерфейсы
                Drawable[] figures = new Drawable[2];
                figures[0] = new Rectangle(1, 50, 50, 250, 200);
                figures[1] = new Circle(1, 300, 200, 80);

                // в цикле проходим по массиву и вызываем метод отрисовки
                for (Drawable d : figures) {
                    d.paint(paintPanel.getGraphics(), Drawable.THICK);
                }
            }
        });
    }

    private void drawRect() {
        Rectangle rect = new Rectangle(1, 50, 50, 250, 200);
        rect.setColor(FigureColor.BLUE);
        // вызываем метод отрисовки - указываем холст и толщину
        rect.paint(paintPanel.getGraphics(), Drawable.THICK);
    }

    public static void main(String[] args) {
        new MainForm();
    }
}
