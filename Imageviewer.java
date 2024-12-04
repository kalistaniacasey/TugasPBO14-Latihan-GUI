import javax.swing.*;

public class ImageViewer {
    public static void main(String[] args) {
        JFrame loginFrame = new JFrame("User Login");
        loginFrame.setSize(300, 200);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        loginFrame.add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(100, 20, 150, 25);
        loginFrame.add(userField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 80, 25);
        loginFrame.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(100, 60, 150, 25);
        loginFrame.add(passField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 100, 80, 25);
        loginFrame.add(loginButton);

        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                loginFrame.dispose();

                showImage();
            } else {
                JOptionPane.showMessageDialog(loginFrame, "Login gagal! Coba lagi.");
            }
        });

        loginFrame.setVisible(true);
    }

    private static void showImage() {
        String path = "meng.jpg"; 
        ImageIcon image = new ImageIcon(path);

        if (image.getIconWidth() == -1) {
            System.out.println("Gambar tidak ditemukan: " + path);
            return;
        }

        JFrame frame = new JFrame("Image Viewer");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(image);
        frame.add(label);

        frame.setVisible(true);
    }
}
