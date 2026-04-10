package EventHandling;

//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//public class Handling_Windows_Event extends JFrame implements WindowListener {
//    JLabel label;
//    public Handling_Windows_Event() {
//        setTitle("Handling Window Listener");
//        setSize(300, 150);
//        label = new JLabel("Window opened.");
//        add(label);
//        addWindowListener(this);
//        setVisible(true);
//    }
//        public void windowOpened(WindowEvent e) {
//            label.setText("Windowopened.");
//        }
//        public void windowClosing(WindowEvent e) {
//            label.setText("Window closing.");
//        }
//            public void windowClosed(WindowEvent e) {}
//            public void windowIconified(WindowEvent e) {
//                label.setText("Window minimized.");
//            }
//            public void windowDeiconified(WindowEvent e) {
//                label.setText("Window restored.");
//            }
//            public void windowActivated(WindowEvent e) {
//                label.setText("Window activated.");
//            }
//            public void windowDeactivated(WindowEvent e) {
//                label.setText("Window deactivated.");
//            }
//            public static void main (String[] args){
//        new Handling_Windows_Event();
//    }
//}

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// Main class
 class SimpleWindowEvent extends JFrame implements WindowListener {

    JLabel label;

    // Constructor
    public SimpleWindowEvent() {

        // Frame title
        setTitle("Window Event Demo");

        // Frame size
        setSize(400, 200);

        // Label create
        label = new JLabel("Start Program", JLabel.CENTER);
        add(label);

        // Add window listener
        addWindowListener(this);

        // Close operation
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Show window
        setVisible(true);
    }

    // Window opened
    public void windowOpened(WindowEvent e) {
        label.setText("Window Opened");
        System.out.println("Window Opened");
    }

    // Window closing
    public void windowClosing(WindowEvent e) {
        label.setText("Window Closing");
        System.out.println("Window Closing");


    }

    // Window closed
    public void windowClosed(WindowEvent e) {
        label.setText("Window Closed");
        System.out.println("Window Closed");

    }

    // Window minimized
    public void windowIconified(WindowEvent e) {
        label.setText("Window Minimized");
        System.out.println("Window Minimized");

    }

    // Window restored
    public void windowDeiconified(WindowEvent e) {
        label.setText("Window Restored");
        System.out.println("Window Restored");

    }

    // Window activated
    public void windowActivated(WindowEvent e) {
        label.setText("Window Active");
        System.out.println("Window Active");

    }

    // Window deactivated
    public void windowDeactivated(WindowEvent e) {
        label.setText("Window Not Active");
        System.out.println("Window Not Active");

    }

    // Main method
    public static void main(String[] args) {
        new SimpleWindowEvent();
    }
}