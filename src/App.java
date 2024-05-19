import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    private JButton cookieButton;
    private JLabel clickCountLabel;
    private int clickCount;

    public App() {
        setTitle("Cookie Clicker");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        clickCount = 0;

        // Cookie button
        cookieButton = new JButton();
        ImageIcon cookieIcon = new ImageIcon("images//cookie_PNG13704.png"); // Change path if needed
        cookieButton.setIcon(cookieIcon);
        cookieButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                clickCountLabel.setText("Cookies: " + clickCount);
            }
        });
        add(cookieButton, BorderLayout.CENTER);

        // Click count label
        clickCountLabel = new JLabel("Cookies: " + clickCount, JLabel.CENTER);
        add(clickCountLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Ensures that the GUI creation and updates are done on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App(); // Create and show the main frame
            }
        });
    }
}
