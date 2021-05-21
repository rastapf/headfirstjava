import java.awt.*;
import javax.swing.*;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        // Draws an oval colored with a gradient between 2 random colors
        Graphics2D g2d = (Graphics2D)g;

        Color startColor = randomColor();
        Color endColor = randomColor();

        GradientPaint gradient = new GradientPaint(70,70,startColor,170,170,endColor);

        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }

    private static Color randomColor() {
        // Return a random color from the RGB color profile with 8-bit depth
        Color randomColor;

        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);

        randomColor = new Color(red, green, blue);

        return randomColor;
    }
}
