// Carson Stell
// 9/2/2024
// OOP Lab 1: Making Change

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegisterPanel extends JPanel {
    JPanel inputPanel = new JPanel();
    PursePanel changePanel;
    JTextField input;

    public RegisterPanel() {
        Register register;

        // Create and modify top panel
        inputPanel.setPreferredSize(new Dimension(775, 145));
        inputPanel.setBackground(Color.LIGHT_GRAY);

        // Put text field on top panel
        input = new JTextField();
        input.setPreferredSize(new Dimension(300, 50));
        input.setFont(new Font("Arial", Font.PLAIN, 20));
        input.addActionListener(new InputListener(RegisterPanel.this) {});

        // Put instructions above text field on top panel
        JLabel introlabel = new JLabel("↓   Enter an amount of money to display below.   ↓");
        introlabel.setFont(new Font("Arial", Font.PLAIN, 25));
        inputPanel.add(introlabel);
        inputPanel.add(input);

        // Create and modify bottom panel
        changePanel = new PursePanel(RegisterPanel.this);
        changePanel.setPreferredSize(new Dimension(775, 405));
        changePanel.setBackground(Color.GRAY);
    }
}