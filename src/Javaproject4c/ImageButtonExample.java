package Javaproject4c;

//Q4c: Swing program with buttons having images

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {
 public static void main(String[] args) {

     JFrame frame = new JFrame("Image Button Example");

     // Load images
     ImageIcon clockIcon = new ImageIcon("clock.png");
     ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

     // Create buttons with images
     JButton btnClock = new JButton(clockIcon);
     JButton btnHourglass = new JButton(hourglassIcon);

     // Label
     JLabel label = new JLabel("Click an image button");
     label.setHorizontalAlignment(JLabel.CENTER);

     frame.setLayout(new FlowLayout());

     frame.add(btnClock);
     frame.add(btnHourglass);
     frame.add(label);

     // Action listeners
     btnClock.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             label.setText("Digital Clock is pressed");
         }
     });

     btnHourglass.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             label.setText("Hour Glass is pressed");
         }
     });

     // Frame settings
     frame.setSize(400, 300);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 }
}