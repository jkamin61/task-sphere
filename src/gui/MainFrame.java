package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
public JFrame frame;

public MainFrame() {
    initialize();
}

    private void initialize() {
        frame = new JFrame("Task Sphere");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLayout(new BorderLayout());
        }

}