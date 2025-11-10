import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberNeighborFrame extends JFrame {
    private JTextField inputField, prevField, nextField;

    public NumberNeighborFrame() {
        setTitle("Number Neighbor Finder");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5));

        // Labels and Fields
        add(new JLabel("Enter Number:"));
        inputField = new JTextField();
        add(inputField);

        add(new JLabel("Previous Number:"));
        prevField = new JTextField();
        prevField.setEditable(false);  // Output only
        add(prevField);

        add(new JLabel("Next Number:"));
        nextField = new JTextField();
        nextField.setEditable(false);  // Output only
        add(nextField);

        // Event Listener for inputField
        inputField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = inputField.getText().trim();
                try {
                    int num = Integer.parseInt(text);
                    prevField.setText(String.valueOf(num - 1));
                    nextField.setText(String.valueOf(num + 1));
                } catch (NumberFormatException ex) {
                    prevField.setText("");
                    nextField.setText("");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new NumberNeighborFrame());
    }
}