
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {

    public MyFrame() {
        setTitle("Button Click Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClicked(); // Call method when button is clicked
            }
        });

        // Add button to the frame
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(button);

        setVisible(true);
    }

    // Method to be called when button is clicked
    private void buttonClicked() {
        showMessage("Button Clicked!");
    }

    // Another method to demonstrate method call
    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        // Create an instance of MyFrame
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyFrame();
            }
        });
    }
}
