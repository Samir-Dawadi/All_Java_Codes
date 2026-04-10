package EventHandling;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
// class ItemListenerExample implements ItemListener {
//
//    JFrame frame;
//    JCheckBox checkBox;
//    JLabel label;
//
//    public ItemListenerExample() {
//        frame = new JFrame("ItemListener Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        checkBox = new JCheckBox("Check Me");
//        label = new JLabel("Checkbox is unchecked");
//
//        checkBox.addItemListener(this);
//
//        JPanel panel = new JPanel();
//        panel.add(checkBox);
//        panel.add(label);
//
//        frame.add(panel);
//        frame.setSize(300, 200);
//        frame.setVisible(true);
//    }
//
//    public void itemStateChanged(ItemEvent e) {
//        if (e.getStateChange() == ItemEvent.SELECTED) {
//            label.setText("Checkbox is checked");
//        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
//            label.setText("Checkbox is unchecked");
//        }
//    }
//
//    public static void main(String[] args) {
//        new ItemListenerExample();
//    }
//}




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class ItemListenerExample extends JFrame implements ItemListener {

    JCheckBox checkBox;
    JLabel label;

    public ItemListenerExample() {

        setTitle("Without Panel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        checkBox = new JCheckBox();
        label = new JLabel("Checkbox is unchecked");

        checkBox.addItemListener(this);

        // Directly adding to JFrame
        add(checkBox);
        add(label);

        setSize(300, 200);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setText("Checkbox is checked");
        } else {
            label.setText("Checkbox is unchecked");
        }
    }

    public static void main(String[] args) {
        new ItemListenerExample();
    }
}