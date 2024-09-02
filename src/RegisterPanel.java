import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// CLASS THAT EXTENDS JPANEL
public class RegisterPanel extends JPanel{
    JPanel inputPanel = new JPanel();
    PursePanel changePanel;
    JTextField input;

    public RegisterPanel() {
        Register register;

        inputPanel.setPreferredSize(new Dimension(775, 145));
        inputPanel.setBackground(Color.LIGHT_GRAY);

        input = new JTextField();
        input.setPreferredSize(new Dimension(300, 50));
        input.setFont(new Font("Arial", Font.PLAIN, 20));
        input.addActionListener(new InputListener() {});

        inputPanel.add(input);

        changePanel = new PursePanel();

        changePanel.setPreferredSize(new Dimension(775, 405));
        changePanel.setBackground(Color.GRAY);
    }
}