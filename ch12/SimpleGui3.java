import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGui3 {
    private JFrame frame;
    private Container cp;
    private JButton buttonColor;
    private JButton buttonLabel;
    private DrawPanel panel;
    private JLabel label;

    public static void main(String[] args) {
        SimpleGui3 gui = new SimpleGui3();
        gui.start();
    }

    public void start() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttonColor = new JButton("Refresh colors!");
        buttonColor.addActionListener(new ColorListener());
        buttonLabel = new JButton("Change label!");
        buttonLabel.addActionListener(new LabelListener());

        panel = new DrawPanel();
        label = new JLabel("Label to be updated");

        cp = frame.getContentPane();
        cp.add(BorderLayout.CENTER, panel);
        cp.add(BorderLayout.SOUTH, buttonColor);
        cp.add(BorderLayout.WEST, label);
        cp.add(BorderLayout.EAST, buttonLabel);
        
        frame.setSize(600,600);
        frame.setVisible(true);
    }

    class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }

    class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Label updated!");
        }
    }
}
