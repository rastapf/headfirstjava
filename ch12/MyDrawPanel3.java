import java.awt.*;
import javax.swing.*;

public class MyDrawPanel3 extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyDrawPanel3 panel = new MyDrawPanel3();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);
    }
}
