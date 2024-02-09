import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CampusMap extends JFrame {
    private ImageIcon mapIcon;
    private JLabel mapLabel;

    public CampusMap() {
        // Load the campus map image
        mapIcon = new ImageIcon("Map_UM1.png");
        mapLabel = new JLabel(mapIcon);
        
        // Set the layout
        setLayout(new BorderLayout());
        add(mapLabel, BorderLayout.CENTER);

        // Example of creating a button for a building
        JButton gymButton = new JButton("GYM");
        gymButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is the gym. It has sports facilities.");
            }
        });

        // Set the button's position on the map using setBounds(x, y, width, height)
        gymButton.setBounds(100, 100, 100, 50); // These values are just placeholders
        mapLabel.setLayout(null);
        mapLabel.add(gymButton);

        // Repeat the above steps for each building...

        // Finalize the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Campus Map");
        setSize(mapIcon.getIconWidth(), mapIcon.getIconHeight());
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CampusMap();
            }
        });
    }
}