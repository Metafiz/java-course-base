package ui;

import javax.swing.*;

public class MainForm extends JFrame {
    private JButton button1;
    private JPanel rootPanel;

    public MainForm() {
        setContentPane(rootPanel);
        setVisible(true);

        this.setSize(800, 600);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainForm();
    }
}
