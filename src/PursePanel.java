import java.awt.*;
import javax.swing.*;

public class PursePanel extends JPanel {
    Purse purse;

    // holds the logic for displaying purse contents
    void PaintComponent(Graphics g) {
        purse = new Purse();
    }
}