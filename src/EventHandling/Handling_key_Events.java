package EventHandling;



//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//public class Handling_key_Events extends JFrame {
//    JTextField t1 = new JTextField(10);
//    JTextField t2 = new JTextField(10);
//
//    public Handling_key_Events() {
//        setLayout(new FlowLayout());
//        setSize(200, 200);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        add(t1);
//        add(t2);
//
//        t2.setEditable(false);
//
//        t1.addKeyListener(new KeyAdapter() {
//            public void keyReleased(KeyEvent e) {
//                t2.setText(t1.getText());
//            }
//        });
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Handling_key_Events();
//    }
//}



//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//public class Handling_key_Events extends JFrame {
//
//    JTextField t1 = new JTextField(10);
//    JTextField t2 = new JTextField(10);
//
//    public Handling_key_Events() {
//        setLayout(new FlowLayout());
//        setSize(300, 200);
//
//        add(t1);
//        add(t2);
//
//        t2.setEditable(true);
//
//        t1.addKeyListener(new KeyListener() {
//
//            @Override
//            public void keyTyped(KeyEvent e) {
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                String copy = t1.getText();
//                t2.setText(copy);
//            }
//        });
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Handling_key_Events();
//    }
//}



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Handling_key_Events extends JFrame implements KeyListener {

    JTextField t;

    public Handling_key_Events() {
        t = new JTextField(5);
//        t = new JTextField("Default value at input field");

        add(t);

        t.addKeyListener(this);

        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }

    public static void main(String[] args) {
        new Handling_key_Events();
    }
}
