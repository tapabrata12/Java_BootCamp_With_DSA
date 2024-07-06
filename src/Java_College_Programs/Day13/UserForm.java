package Java_College_Programs.Day13;

import javax.swing.*;
import java.awt.*;

public class UserForm {

    public UserForm() {
        JFrame frame = new JFrame("User Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField(10);
        panel.add(firstNameLabel);
        panel.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField(10);
        panel.add(lastNameLabel);
        panel.add(lastNameField);

        JLabel dobLabel = new JLabel("Date of Birth:");
        JTextField dobField = new JTextField(10);
        panel.add(dobLabel);
        panel.add(dobField);

        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new UserForm();
    }
}
