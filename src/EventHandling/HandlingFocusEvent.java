package EventHandling;
//public class Handling_Focus_Events {
//
//}

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Handling_Focus_Events extends JFrame implements FocusListener {
//
//    JTextField t1, t2;
//
//    public Handling_Focus_Events() {
//        t1 = new JTextField(10);
//        t2 = new JTextField(10);
//
//        add(t1);
//        add(t2);
//
//        t1.addFocusListener(this);
//        t2.addFocusListener(this);
//
//        setLayout(new FlowLayout());
//        setSize(300, 200);
//        setVisible(true);
//
//    }
//
//    public void focusGained(FocusEvent e) {
//        JTextField t = (JTextField) e.getSource();
//        t.setBackground(Color.YELLOW); // focus gained → highlight
//    }
//
//    public void focusLost(FocusEvent e) {
//        JTextField t = (JTextField) e.getSource();
//        t.setBackground(Color.WHITE); // focus lost → back to normal
//    }
//
//    public static void main(String[] args) {
//        new Handling_Focus_Events();
//    }
//}




import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HandlingFocusEvent extends JFrame implements FocusListener {

    JTextField tf1;
    JTextField tf2;

    public HandlingFocusEvent() {
        setTitle("Focus Listener Example");
        setLayout(new GridLayout(2, 2));
        setSize(250, 150);

        tf1 = new JTextField();
        tf2 = new JTextField();

        add(tf1);
        add(tf2);

        tf1.addFocusListener(this);
        tf2.addFocusListener(this);

        setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == tf1) {
            tf1.setBackground(Color.YELLOW);
        } else if (e.getSource() == tf2) {
            tf2.setForeground(Color.white);
            tf2.setBackground(Color.BLUE);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == tf1) {
            tf1.setBackground(Color.WHITE);
        } else if (e.getSource() == tf2) {
            tf2.setBackground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        new HandlingFocusEvent();
    }
}


