package ui;

import classes.figures.Circle;
import classes.figures.Rectangle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton btnAddRect;
    private JButton btnAddCircle;
    private JPanel paintPanel;

    public MainForm() {
        setContentPane(rootPanel);
        setVisible(true);

        this.setSize(800, 600);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btnAddCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circle c = new Circle(1, 300, 200, 80);
                c.paint(paintPanel.getGraphics());
            }
        });

        btnAddRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawRect();
            }
        });
    }

    private void drawRect() {
        Rectangle rect = new Rectangle(1, 50, 50, 250, 200);
        rect.paint(paintPanel.getGraphics());
    }

    public static void main(String[] args) {
        new MainForm();
    }
}
