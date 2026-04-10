

import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;

public class Handling_Mouse_Event extends JFrame implements MouseListener {

     JButton btn;

    public Handling_Mouse_Event() {
        setTitle("Handling Mouse Listener");
        setSize(300, 150);

        // Layout set गर्नुपर्छ नभए component random राखिन्छ
        setLayout(new FlowLayout()); // FlowLayout → left to right, automatically arranges components

        btn = new JButton("Click me!");
        add(btn);

        btn.addMouseListener(this);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        btn.setText("Clicked!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        btn.setText("Pressed!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        btn.setText("Released!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        btn.setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        btn.setBackground(null);
        btn.setText("Try me!");
    }

    public static void main(String[] args) {
        new Handling_Mouse_Event();
    }
}
