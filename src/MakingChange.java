// Carson Stell
// 9/2/2024
// OOP Lab 1: Making Change

import java.awt.*;
import javax.swing.*;

public class MakingChange {
    // MakingChange Main
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Making Change - OOP Lab 1 by Carson Stell");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RegisterPanel registerPanel = new RegisterPanel(); // Create RegisterPanel object

        frame.setPreferredSize(new Dimension(800, 600));
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setLayout(new FlowLayout()); // Using FlowLayout() helped the panel show up as it should on the frame.
        frame.pack();
        frame.setVisible(true);

        // Add the inputPanel from RegisterPanel to the top of the main panel
        frame.getContentPane().add(registerPanel.inputPanel);
        frame.getContentPane().add(registerPanel.changePanel);
    }
}
