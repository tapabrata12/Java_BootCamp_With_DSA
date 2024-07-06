import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        JButton button = new JButton("Click Here");
        button.setBounds(50, 100, 100, 40); // Set button position and size
        frame.add(button); // Add button to the frame
        frame.setSize(400, 400); // Set frame size
        frame.setLayout(null); // Disable default layout manager
        frame.setVisible(true); // Make frame visible
    }
}
