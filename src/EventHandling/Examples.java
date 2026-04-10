package EventHandling;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//class Addition extends JFrame implements ActionListener {
//    JLabel l1, l2;
//    JTextField t1, t2, t3;
//    JButton b1;
//
//    public Addition() {
//        // Labels
//        l1 = new JLabel("First Number:");
//        t1 = new JTextField(10);
//
//        l2 = new JLabel("Second Number:");
//        t2 = new JTextField(10);
//
//        // Button
//        b1 = new JButton("Sum");
//
//        // Result text field
//        t3 = new JTextField(10);
//        t3.setEditable(false);
//
//        // Adding components
//        add(l1);
//        add(t1);
//        add(l2);
//        add(t2);
//        add(b1);
//        add(t3);
//
//        // Register button click event
//        b1.addActionListener(this);
//        setLayout(new FlowLayout());
//        // Frame properties
//        setSize(400, 200);
//
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == b1) {
//            try {
//                int num1 = Integer.parseInt(t1.getText());
//                int num2 = Integer.parseInt(t2.getText());
//                int sum = num1 + num2;
//                t3.setText(String.valueOf(sum));
//            } catch (NumberFormatException ex) {
//                t3.setText("Invalid Input");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        new Addition();
//    }
//}























//Write a GUI program using components to find the sum and difference of two numbers. Use two text fields for giving input and a label for output. The program should display the sum if the user presses the mouse and the difference if the user releases the mouse.



//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//class SumDifferenceFloatLayout extends JFrame {
//    JTextField t1, t2;
//    JLabel resultLabel;
//
//    public SumDifferenceFloatLayout() {
//        // Frame setup
//        setTitle("Sum & Difference Calculator");
//        setSize(400, 150);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Float-like layout
//        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
//
//        // Input fields
//        t1 = new JTextField(10);
//        t2 = new JTextField(10);
//        add(new JLabel("First Number:"));
//        add(t1);
//        add(new JLabel("Second Number:"));
//        add(t2);
//
//        // Result label
//        resultLabel = new JLabel("Result will appear here");
//        add(resultLabel);
//
//        // Mouse listener for the frame
//        this.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                try {
//                    float num1 = Float.parseFloat(t1.getText());
//                    float num2 = Float.parseFloat(t2.getText());
//                    float sum = num1 + num2;
//                    resultLabel.setText("Sum: " + sum);
//                } catch (NumberFormatException ex) {
//                    resultLabel.setText("Invalid Input");
//                }
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                try {
//                    float num1 = Float.parseFloat(t1.getText());
//                    float num2 = Float.parseFloat(t2.getText());
//                    float diff = num1 - num2;
//                    resultLabel.setText("Difference: " + diff);
//                } catch (NumberFormatException ex) {
//                    resultLabel.setText("Invalid Input");
//                }
//            }
//        });
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new SumDifferenceFloatLayout();
//    }
//}





//Write a Java program to find the sum of two numbers using swing components. Use text
//fields for input and output. Your program displays output if you press any key in keyboard.
//Use key adapter to handle events.


//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
// class Addition {
//
//    JLabel l1, l2, l3;
//    JTextField t1, t2, t3;
//    JFrame f = new JFrame("Addition Program");
//
//    Addition() {
//
//        l1 = new JLabel("First Number:");
//        t1 = new JTextField(15);     //coln diyena vani sano auxa default ma ani input nai ddina mildaina if flow layout use garyaxam vani
//
//        l2 = new JLabel("Second Number:");
//        t2 = new JTextField(15);
//
//        l3 = new JLabel("Press any key");
//        t3 = new JTextField(15);
//
//        // Key listener add
//        t3.addKeyListener(new KeyChecker());
//
//        f.add(l1);
//        f.add(t1);
//        f.add(l2);
//        f.add(t2);
//        f.add(l3);
//        f.add(t3);
//
//        f.setSize(300, 150);
//        f.setLayout(new FlowLayout());
//        f.setVisible(true);
//    }
//
//    class KeyChecker extends KeyAdapter {
//        public void keyPressed(KeyEvent e) {
//            try {
//                int num1 = Integer.parseInt(t1.getText());
//                int num2 = Integer.parseInt(t2.getText());
//                int sum = num1 + num2;
//
////                JOptionPane.showMessageDialog(f, "The sum is: " + sum);       //popup message box (dialog box) , f->frame
//                t3.setText(String.valueOf(sum));
////                l3.setText("summed value is");
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(f, "Please enter valid numbers!");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        new Addition();
//    }
//}






//Write a GUI program using swing component to find number of words and characters in a TextArea.



//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//class TextAreaExample implements ActionListener {
//
//    JLabel l1, l2;
//    JTextArea area;
//    JButton b;
//
//    TextAreaExample() {
//
//        JFrame f = new JFrame();
//
//        l1 = new JLabel();
////        l1.setBounds(50, 25, 150, 30);
//
//        l2 = new JLabel();
////        l2.setBounds(200, 25, 150, 30);
//
//        area = new JTextArea();
////        area.setBounds(20, 75, 350, 200);
//
//        b = new JButton("Count Words");
//        b.setBounds(120, 300, 150, 30);
//        b.addActionListener(this);
//
//        f.add(l1);
//        f.add(l2);
//        f.add(area);
//        f.add(b);
//
//        f.setSize(400, 400);
//        f.setLayout(new FlowLayout());
//        f.setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        String text = area.getText();
//
//        String words[] = text.trim().split("\\s+");
//
//        l1.setText("Words: " + words.length);
//        l2.setText("Characters: " + text.length());
//    }
//
//    public static void main(String[] args) {
//        new TextAreaExample();
//    }
//}







//Design a GUI form using swing with a text field, a text label for displaying the input
//        message "Input any string", and three buttons with caption "Check Palindrome",
//        "Reverse", "Find Vowels". Write a complete program for above scenario and for checking
//        palindrome in first button, reverse it after clicking second button and extract the vowels from
//        it after clicking third button.







//import javax.swing.*;
//import java.awt.event.*;
//
// class StringOperationsLogic extends JFrame implements ActionListener {
//
//    JTextField inputTextField, outputTextField;
//    JButton checkPalindromeButton, reverseButton, findVowelButton;
//
//    public StringOperationsLogic() {
//        setTitle("String Operations");
//        setLayout(null);
//
//        // Labels and TextFields
//        JLabel inputLabel = new JLabel("Input any String: ");
//        inputLabel.setBounds(30, 30, 150, 25);
//        add(inputLabel);
//
//        inputTextField = new JTextField();
//        inputTextField.setBounds(180, 30, 200, 25);
//        add(inputTextField);
//
//        JLabel outputLabel = new JLabel("Output: ");
//        outputLabel.setBounds(30, 70, 150, 25);
//        add(outputLabel);
//
//        outputTextField = new JTextField();
//        outputTextField.setBounds(180, 70, 200, 25);
//        outputTextField.setEditable(false);
//        add(outputTextField);
//
//        // Buttons
//        checkPalindromeButton = new JButton("Check Palindrome");
//        checkPalindromeButton.setBounds(50, 120, 150, 30);
//        add(checkPalindromeButton);
//
//        reverseButton = new JButton("Reverse");
//        reverseButton.setBounds(220, 120, 150, 30);
//        add(reverseButton);
//
//        findVowelButton = new JButton("Find Vowels");
//        findVowelButton.setBounds(135, 170, 150, 30);
//        add(findVowelButton);
//
//        // Attach listeners using 'this'
//        checkPalindromeButton.addActionListener(this);
//        reverseButton.addActionListener(this);
//        findVowelButton.addActionListener(this);
//
//        setSize(450, 300);
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String userInput = inputTextField.getText();
//
//        if (e.getSource() == checkPalindromeButton) {
//            // Palindrome logic as given
//            String copyUserInput = "";
//            int length = userInput.length();
//            for (int i = length - 1; i >= 0; i--) {
//                copyUserInput += userInput.charAt(i);
//            }
//            if (copyUserInput.equalsIgnoreCase(userInput)) {
//                outputTextField.setText("String is palindrome.");
//            } else {
//                outputTextField.setText("String isn't palindrome.");
//            }
//
//        } else if (e.getSource() == reverseButton) {
//            // Reverse logic as given
//            String reverseUserInput = "";
//            int length = userInput.length();
//            for (int i = length - 1; i >= 0; i--) {
//                reverseUserInput += userInput.charAt(i);
//            }
//            outputTextField.setText("Reverse String is: " + reverseUserInput);
//
//        } else if (e.getSource() == findVowelButton) {
//            // Vowel logic as given
//            char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
//            String showVowel = "";
//            for (int i = 0; i < userInput.length(); i++) {
//                for (int j = 0; j < vowels.length; j++) {
//                    if (userInput.charAt(i) == vowels[j]) {
//                        showVowel += userInput.charAt(i);
//                    }
//                }
//            }
//            outputTextField.setText("Vowels: " + showVowel);
//        }
//    }
//
//    public static void main(String[] args) {
//        new StringOperationsLogic();
//    }
//}






//or  using adapter class:


import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

 class KeyAdapterStringOperations2 extends JFrame {

    JTextField inputTextField;
    JLabel outputLabel;

    public KeyAdapterStringOperations2() {
        setTitle("KeyAdapter String Operations");
        setSize(500, 200);
        setLayout(new FlowLayout());

        inputTextField = new JTextField(20);
        add(inputTextField);

        outputLabel = new JLabel("Type something...");
        add(outputLabel);

        inputTextField.addKeyListener(new CustomKeyAdapter()); // Use adapter

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class CustomKeyAdapter extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
            String userInput = inputTextField.getText();

            // 1️⃣ Reverse
            String reverse = "";
            for (int i = userInput.length() - 1; i >= 0; i--) {
                reverse += userInput.charAt(i);
            }

            // 2️⃣ Palindrome check
            String palindromeMsg = reverse.equalsIgnoreCase(userInput) ? "Palindrome" : "Not Palindrome";

            // 3️⃣ Find vowels
            char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
            String foundVowels = "";
            for (int i = 0; i < userInput.length(); i++) {
                for (char v : vowels) {
                    if (userInput.charAt(i) == v) {
                        foundVowels += v;
                    }
                }
            }

            // Update output label dynamically
            outputLabel.setText("Rev: " + reverse + " | " + palindromeMsg + " | Vowels: " + foundVowels);
        }
    }

    public static void main(String[] args) {
        new KeyAdapterStringOperations2();
    }
}



