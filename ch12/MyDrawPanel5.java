import java.awt.*;
import javax.swing.*;

public class MyDrawPanel5 {
    int x = 0;
    int y = 0;

    public static void main(String[] args){
        MyDrawPanel5 gui = new MyDrawPanel5();
        gui.start();
    }

    public void start() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        AnimatedPanel panel = new AnimatedPanel();

        frame.getContentPane().add(panel);

        frame.setVisible(true);

        for(int i = 0; i < 330; i++) {
            x++;
            y++;

            panel.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ex) {

            }
        }
    }

    class AnimatedPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.fillRect(0,0,this.getWidth(), this.getHeight());

            g.setColor(new Color(255,0,0));
            g.fillOval(x,y,70,70);
        }
    }
}