// Carson Stell
// 9/2/2024
// OOP Lab 1: Making Change

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// InputListener connected to the text field in RegisterPanel
class InputListener implements ActionListener {
    RegisterPanel panel;

    public InputListener(RegisterPanel panel) {
        this.panel = panel;
    }

    // Executed when enter key is pressed within the text field
    public void actionPerformed(ActionEvent e) {
        String text = panel.input.getText();
        double amt = Double.parseDouble(text);

        panel.changePanel.PaintComponent(amt);
    }
}
