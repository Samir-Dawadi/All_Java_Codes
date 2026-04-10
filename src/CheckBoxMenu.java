
import javax.swing.*;
import java.awt.*;

public class CheckBoxMenu {
    public static void main(String[] args) {

        JFrame f = new JFrame();

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("file");
        JMenu zoom = new JMenu("Zoom");


        ImageIcon image = new ImageIcon("./save.png");
        JMenuItem savefile = new JMenuItem("save as", image);
        JCheckBoxMenuItem autosave=new JCheckBoxMenuItem("Auto Save");

        JRadioButtonMenuItem x10=new JRadioButtonMenuItem("x10",true);
        JRadioButtonMenuItem x30=new JRadioButtonMenuItem("x30");
        JRadioButtonMenuItem x70=new JRadioButtonMenuItem("x70");
        JRadioButtonMenuItem x100= new JRadioButtonMenuItem("x100");

        ButtonGroup bg=new ButtonGroup();   //25-29 le radio button yeauta matra select garna help garca natra yeti line vayena vani sabai radio button select garna miltheo
        bg.add(x10);
        bg.add(x30);
        bg.add(x70);
        bg.add(x100);


        zoom.add(x10);
        zoom.add(x30);
        zoom.add(x70);
        zoom.add(x100);

        file.add(autosave);
        file.add(savefile);

        menuBar.add(file);
        menuBar.add(zoom);

        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setVisible(true);

    }
}
