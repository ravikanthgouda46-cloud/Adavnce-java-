package Javaproject5d;

// Q5d: Swing program to create Tabbed Pane with Cyan, Magenta and Yellow tabs

import javax.swing.*;
import java.awt.*;

public class TabbedPaneColors2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabbed Pane Colors");

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panels with colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add to frame
        frame.add(tabbedPane);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}