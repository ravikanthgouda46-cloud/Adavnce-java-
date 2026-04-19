package Javaproject4a;

// Q4a Swing Program

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class HelloSwing {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Example");

        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming");

        label.setFont(new Font("Arial", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}