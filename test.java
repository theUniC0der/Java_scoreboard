package randomtest;

import javax.swing.*;
import java.awt.*;

public class testing {
	
    public testing() {
        // Create the main JFrame
        JFrame frame = new JFrame("Six Row GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1)); // 6 rows, 1 column

        for (int i = 0; i < 6; i++) {
            JPanel rowPanel = new JPanel(new GridLayout(1, 7)); // Each row has 1 row and 7 columns

            // Add a button to the row
            JButton rowButton = new JButton("Button " + (i + 1));
            rowPanel.add(rowButton);

            // Add 4 text fields to the row
            for (int j = 0; j < 4; j++) {
                JTextField textField = new JTextField(10); // Adjust the column count as needed
                rowPanel.add(textField);
            }

            // Add two more buttons to the row
            JButton button1 = new JButton("Button A");
            JButton button2 = new JButton("Button B");
            rowPanel.add(button1);
            rowPanel.add(button2);

            // Add the row panel to the main frame
            frame.add(rowPanel);
        }

        // Set frame size and make it visible
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new testing();
            }
        });
    }
}
