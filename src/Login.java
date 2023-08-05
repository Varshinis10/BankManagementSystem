import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
        JButton login, signup, clear;
        JTextField cardTextField;
        JPasswordField pinTextField;
        Login()
        {
                setTitle("Automated Teller Machine");

                setLayout(null);//only then the location of the image will be changed

                JLabel text = new JLabel("Welcome to ATM");
                text.setFont(new Font("Algerian",Font.BOLD,38));
                text.setBounds(220,40,400,40);//To make the text visible
                add(text);

                JLabel cardno = new JLabel("Card No :");// cardno
                cardno.setFont(new Font("Britannic Bold",Font.BOLD,25));
                cardno.setBounds(160,150,150,40);//To make the text visible
                add(cardno);

                cardTextField = new JTextField();
                cardTextField.setBounds(300,150,230,30);
                cardTextField.setFont(new Font("Arial",Font.BOLD,14));
                add(cardTextField);

                JLabel pin = new JLabel("PIN :");
                pin.setFont(new Font("Britannic Bold",Font.BOLD,25));
                pin.setBounds(217,220,250,30);//To make the text visible
                add(pin);

                pinTextField = new JPasswordField();
                pinTextField.setBounds(300,220,230,30);
                add(pinTextField);

                login = new JButton("Sign In");
                login.setFont(new Font("Candara",Font.BOLD,18));
                login.setBounds(300,300,100,30);
                login.setBackground(Color.BLACK);
                login.setForeground(Color.WHITE);
                login.addActionListener(this);
                add(login);

                clear = new JButton("Clear");
                clear.setFont(new Font("Candara",Font.BOLD,18));
                clear.setBounds(430,300,100,30);
                clear.setBackground(Color.BLACK);
                clear.setForeground(Color.WHITE);
                clear.addActionListener(this);
                add(clear);

                signup = new JButton("Sign Up");
                signup.setFont(new Font("Candara",Font.BOLD,18));
                signup.setBounds(360,350,100,30);
                signup.setBackground(Color.BLACK);
                signup.setForeground(Color.WHITE);
                signup.addActionListener(this);
                add(signup);

                setSize(800,480); //Defines the dimension of the frame
                getContentPane().setBackground(Color.LIGHT_GRAY);
                setVisible(true); //to make the frame setVisible
                setLocation(350,200); //moves 350 towards right and 200 down
        }

        public void actionPerformed(ActionEvent ae)
        {
                if(ae.getSource()==clear)
                {
                        cardTextField.setText("");
                        pinTextField.setText("");
                }
                else if(ae.getSource()==login)
                {

                }
                else if(ae.getSource()==signup)
                {

                }
        }

        public static void main(String args[])
        {
                new Login();
        }
}