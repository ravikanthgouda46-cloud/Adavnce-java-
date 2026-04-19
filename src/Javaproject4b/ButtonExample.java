package Javaproject4b;

//Q4b: Develop a Swing program to display message based on button click

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonExample {
 public static void main(String[] args) {

     // Create frame
     JFrame frame = new JFrame("Button Example");

     // Create buttons
     JButton btnIndia = new JButton("India");
     JButton btnSrilanka = new JButton("Srilanka");

     // Create label
     JLabel label = new JLabel("Click a button");
     label.setHorizontalAlignment(JLabel.CENTER);

     // Set layout
     frame.setLayout(new FlowLayout());

     // Add components
     frame.add(btnIndia);
     frame.add(btnSrilanka);
     frame.add(label);

     // Action for India button
     btnIndia.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             label.setText("India is pressed");
         }
     });

     // Action for Srilanka button
     btnSrilanka.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             label.setText("Srilanka is pressed");
         }
     });

     // Frame settings
     frame.setSize(400, 200);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 }
}