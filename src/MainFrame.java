import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;



public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("User Entrance");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(170,160,180));




        JLabel userNameLabel = new JLabel("Username:");
        JTextField userNameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);

        JButton loginButton = new JButton("Login");
        JButton forgotButton = new JButton("forgot password");

        panel.add(userNameLabel);
        panel.add(userNameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(forgotButton);

        add(panel);



        loginButton.addActionListener(
                new ActionListener(){

                    public void actionPerformed(ActionEvent e){

                        String username =userNameField.getText();
                        String passord =passwordField.getText();
                        userNameField.setText(null);
                        passwordField.setText(null);

                        try{DriverManager.getConnection("jdbc:sqlite:userEntrance.db");
                            st=c.createStatement();
                            String inquiry;         //To be continued
                        }
                        catch(SQLException a){
                            System.out.println(a.getMessage());
                        }


                    }
                }


        );

        forgotButton.addActionListener(
                new ActionListener(){

                    public void actionPerformed(ActionEvent e){



                    }
                }


        );

    }
    public Statement st;
    public Connection c;
    public ResultSet rs;
    String username;
    String password;
    String secQ;
    String answer;

}