import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleWindow {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Simple Window");

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold components
        JPanel panel = new JPanel();

        // Add a button to the panel
        JButton button = new JButton("Click Me");
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set the size of the window
        frame.setSize(300, 200);
        
        // Set the window's visibility
        frame.setVisible(true);
        
        // Center the window on the screen
        frame.setLocationRelativeTo(null);
    }
}
