import java.awt.*;
import javax.swing.*;

public class MyDrawPanel2 extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyDrawPanel2 panel = new MyDrawPanel2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setSize(900,1500);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("catzillaforweb.jpg").getImage();
        g.drawImage(image,3,4,this);
    }
}