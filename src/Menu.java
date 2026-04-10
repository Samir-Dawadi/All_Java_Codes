import javax.swing.*;

public class Menu {
    public static void main(String[] args){
       JFrame f= new JFrame();
       JMenuBar menuBar=new JMenuBar();

       JMenu video = new JMenu("Vidoes");

        JMenuItem watch=new JMenuItem("watch");
        JMenuItem edit=new JMenuItem("edit");
       JMenuItem delete=new JMenuItem("delete");

       JMenu option = new JMenu("options");
       JMenuItem a=new JMenuItem("PASSWORD.TXT");
       JMenuItem b=new JMenuItem("NEWPASSWORD.TXT");

       option.add(a);
       option.add(b);

       video.add(watch);
       video.add(edit);
       video.add(delete);
       video.add(option);

       b.setEnabled(false);

       menuBar.add(video);

       f.setJMenuBar(menuBar);
       f.setSize(400,400);
       f.setVisible(true);

    }
}