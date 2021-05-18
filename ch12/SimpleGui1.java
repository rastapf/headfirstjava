import javax.swing.*;

public class SimpleGui1 {
    public static void main(String[] args) {
        // Create frame which contains GUI elements
        JFrame frame = new JFrame();

        // Create button
        JButton button = new JButton("Clich here!");

        // Set default behavior when closing the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adds the button in the content area
        frame.getContentPane().add(button);

        // Set window size and visibility
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}