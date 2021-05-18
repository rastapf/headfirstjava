import javax.swing.*;
// Import event related methods
import java.awt.event.*;

// Implements ActionListener interface to be able to receive events from button
public class SimpleGui2 implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me!");

        // Pass the instance of this class to addActionListener method
        // This indicates that this class will be listening for the event
        // triggered when the action occurs
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    // Overrides the actionPerformed method from the ActionListener interface
    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }
}
