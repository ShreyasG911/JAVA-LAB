// Practical: Program to display "All The Best" in 5 different colors using AWT

import java.awt.*;
import java.awt.event.*;

public class AllTheBestColors extends Frame {

    AllTheBestColors() {
        setSize(500, 400);
        setTitle("AWT Colors Example");
        setVisible(true);

        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // Set font
        g.setFont(new Font("Arial", Font.BOLD, 30));

        // Draw "All The Best" in different colors at different positions
        g.setColor(Color.RED);
        g.drawString("All The Best", 100, 100);

        g.setColor(Color.BLUE);
        g.drawString("All The Best", 100, 150);

        g.setColor(Color.GREEN);
        g.drawString("All The Best", 100, 200);

        g.setColor(Color.MAGENTA);
        g.drawString("All The Best", 100, 250);

        g.setColor(Color.ORANGE);
        g.drawString("All The Best", 100, 300);
    }

    public static void main(String[] args) {
        new AllTheBestColors();
    }
}
