package EventHandling;//import java.awt.*;
//import java.awt.event.ActionListener;
//import java.awt.*;
//import javax.swing.*;
//
//public class EventHandlling extends JFrame implements ActionListener {
//    JTextField tf;
//    EventHandlling(){
//         tf = new JTextField();
//        tf.setBounds(30,40,50,50);
//        JButton b=new JButton("CLICK ME");
//        b.setBounds(50,60,70,40);
//        b.addActionListener(this);
//        add(tf);
//        add(b);
//        setSize(500,600);
//        setVisible(true);
//        setLayout(null);
//
//    }
//
//    @Override
//    public void actionPerformed(EventHandlling e){
//        tf.setText("Button clicked!");
//    }
//    public static void main(String[] args){
//        new EventHandlling();
//    }
//}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Handling_Action_Event extends JFrame implements ActionListener {

    JTextField tf;

    Handling_Action_Event(){
        tf = new JTextField();
        tf.setBounds(30,40,150,30);

        JButton b = new JButton("CLICK ME");
        b.setBounds(50,100,120,40);

        b.addActionListener(this);

        add(tf);
        add(b);
        tf.setEditable(false);
        setSize(500,600);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        tf.setText("Button clicked!");
    }

    public static void main(String[] args){
        new Handling_Action_Event();
    }
}





