import java.awt.*;
import javax.swing.*;

public class MyDrawPanel4 extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyDrawPanel4 panel = new MyDrawPanel4();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;

        Color startColor = randomColor();
        Color endColor = randomColor();

        GradientPaint gradient = new GradientPaint(60,60,startColor,170,170,endColor);

        g2d.setPaint(gradient);

        g2d.fillOval(70,70,100,100);
    }

    private Color randomColor() {
        Color randomColor;

        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);

        randomColor = new Color(red, green, blue);
        return randomColor;
    }
}