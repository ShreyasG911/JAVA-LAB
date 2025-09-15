// Practical: Program to demonstrate Keyboard Events in Java

import java.awt.*;
import java.awt.event.*;

public class KeyboardEventDemo extends Frame implements KeyListener {

    Label l1, l2, l3;

    KeyboardEventDemo() {
        // Labels
        l1 = new Label("Press any key...");
        l1.setBounds(50, 100, 300, 30);

        l2 = new Label("Key Pressed: ");
        l2.setBounds(50, 150, 300, 30);

        l3 = new Label("Key Released: ");
        l3.setBounds(50, 200, 300, 30);

        // Add labels to frame
        add(l1);
        add(l2);
        add(l3);

        // Frame properties
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        // Add KeyListener
        addKeyListener(this);

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // KeyListener methods
    public void keyPressed(KeyEvent e) {
        l2.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        l3.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        l1.setText("Key Typed: " + e.getKeyChar());
    }

    // Main method
    public static void main(String[] args) {
        new KeyboardEventDemo();
    }
}
