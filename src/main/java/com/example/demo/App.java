package com.example.demo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) {
        // Display "Hello World!" on the console
        System.out.println("Hello World!");

        // Create and display the GUI
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("GUI Example");

        // Set the size of the window
        frame.setSize(300, 200);

        // Create a new JLabel (text label)
        JLabel label = new JLabel("Hello, GUI World!");

        // Add the label to the content pane of the window
        frame.getContentPane().add(label);

        // Set the default close operation of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
    }
}
