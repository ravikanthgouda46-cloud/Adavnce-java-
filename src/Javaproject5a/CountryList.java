package Javaproject5a;

// Q5a: Swing program to add countries to JList and display selected country

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryList {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List");

        // Country list
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);

        // Scroll pane (important)
        JScrollPane scrollPane = new JScrollPane(list);

        // Add selection listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selected = list.getSelectedValue();
                    System.out.println("Selected Country: " + selected);
                }
            }
        });

        // Layout
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}