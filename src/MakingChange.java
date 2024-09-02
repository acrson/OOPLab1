import java.awt.*;
import javax.swing.*;

public class MakingChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Making Change");
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
