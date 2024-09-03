// Carson Stell
// 9/2/2024
// OOP Lab 1: Making Change

import java.awt.*;
import java.util.Map;
import javax.swing.*;

public class PursePanel extends JPanel {
    Purse purse;
    Register register;
    RegisterPanel registerPanel;

    /* Ensure that the registerPanel object created above inherits properties from RegisterPanel,
       more specifically, the changePanel PursePanel object. */
    public PursePanel(RegisterPanel registerPanel) {
        this.registerPanel = registerPanel;
    }

    // Holds the logic for displaying purse contents
    void PaintComponent(double amt) {
        purse = new Purse();
        register = new Register();

        // Clears previous denominations on the PursePanel
        registerPanel.changePanel.removeAll();

        // Use the makeChange method from Register to fill the purse
        purse = register.makeChange(amt);
        int total = 0; // Used to calculate if the purse is empty
        int value;     // Used to display the correct number of each denomination

        // Check if purse is empty-- if so, return "Nothing" to the bottom panel
        for (Map.Entry<Denomination, Integer> entry : purse.cash.entrySet()) {
            total += entry.getValue();
        }

        if (total < 0.005) {
            registerPanel.changePanel.add(new JLabel("Nothing")).setFont(new Font("Arial", Font.BOLD, 200));
        }

        // If the purse is not empty, display the proper amount of denominations to the bottom panel
        for (Map.Entry<Denomination, Integer> entry : purse.cash.entrySet()) {
            value = entry.getValue(); // Set value to the number of bills/coins in the current denomination

            /* Display one image of the denomination, then decrease value by 1, and repeat until the correct
               number of images for said denomination are present on the bottom panel */
            while (value > 0) {
                // Retrieve image from given denomination's file path
                ImageIcon img = new ImageIcon(entry.getKey().img());
                Image originalImage = img.getImage();

                // Scale down the size of the image
                int newheight, newwidth;
                if (entry.getKey().form() == "bill") {
                    newheight = 104;
                    newwidth = 245;
                }
                else if (entry.getKey().name() == "Quarter") {
                    newheight = 70;
                    newwidth = 70;
                }
                else if (entry.getKey().name() == "Dime") {
                    newheight = 50;
                    newwidth = 50;
                }
                else if (entry.getKey().name() == "Nickel") {
                    newheight = 60;
                    newwidth = 60;
                }
                else {
                    newheight = 55;
                    newwidth = 55;
                }

                Image scaledImage = originalImage.getScaledInstance(newwidth, newheight, Image.SCALE_SMOOTH);
                ImageIcon newImg = new ImageIcon(scaledImage);
                JLabel imgLabel = new JLabel(newImg);

                // Display image to the bottom panel
                registerPanel.changePanel.add(imgLabel);

                value--; // Decrease value by 1
            }
        }

        // Ensure image(s) display to bottom panel
        registerPanel.changePanel.revalidate();
        registerPanel.changePanel.repaint();
    }
}