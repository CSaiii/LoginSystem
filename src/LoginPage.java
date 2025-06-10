import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID");
    JLabel userPasswordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel("Message");

    HashMap<String,String> loginfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> loginforOriginal) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login System");
        frame.setSize(500, 750);
        frame.setLayout(null);

    }
    @Override
    public void actionPerformed(ActionEvent e) {


    }

}
