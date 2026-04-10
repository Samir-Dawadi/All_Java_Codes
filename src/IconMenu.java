import javax.swing.*;
import java.awt.*;
public class IconMenu {
    public static void main(String[] args) {

        JFrame f = new JFrame();

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("file");

        ImageIcon image = new ImageIcon("./save.png");
        JMenuItem savefile = new JMenuItem("save as", image);

        file.add(savefile);
        menuBar.add(file);
        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setVisible(true);

    }
}
