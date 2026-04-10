package EventHandling;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class KeyAdapterExample extends JFrame {
    JLabel outputLabel;

    public KeyAdapterExample() {
        setTitle("KeyAdapter Example");
        setSize(400, 200);
        setLayout(new FlowLayout());

        outputLabel = new JLabel("Press a key");
        add(outputLabel);

        addKeyListener(new CustomKeyAdapter()); // Adapter use
        setVisible(true);
    }

    class CustomKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            outputLabel.setText("Key Pressed: ");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            outputLabel.setText("Key Released: " );
        }

        // keyTyped is optional; already implemented in KeyAdapter
    }

    public static void main(String[] args) {
        new KeyAdapterExample();
    }
}
