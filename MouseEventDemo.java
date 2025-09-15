// Practical: Program to demonstrate Mouse Events (Live Coordinates + Left/Right Click)

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {
    Label l;

    MouseEventDemo() {
        // Label
        l = new Label("Perform Mouse Actions...");
        l.setBounds(50, 100, 350, 30);
        add(l);

        // Frame settings
        setSize(500, 400);
        setLayout(null);
        setVisible(true);

        // Add listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Helper: detect button type
    private String getButtonName(MouseEvent e) {
        switch (e.getButton()) {
            case MouseEvent.BUTTON1: return "Left Button";
            case MouseEvent.BUTTON2: return "Middle Button";
            case MouseEvent.BUTTON3: return "Right Button";
            default: return "Unknown Button";
        }
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        l.setText(getButtonName(e) + " Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        l.setText(getButtonName(e) + " Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText(getButtonName(e) + " Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered Window at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited Window at (" + e.getX() + ", " + e.getY() + ")");
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
