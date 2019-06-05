import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JFrame implements ActionListener
{
    JPanel main = new JPanel();
    JButton loginButton, registerButton;
    JTextField userText, passText;

    JLabel infoLabel;
    Sql sql = new Sql();



    public Okno()
    {
        super("Logowanie");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxLayout bx = new BoxLayout(main, BoxLayout.Y_AXIS);
        main.setLayout(bx);
        // panel login
        JPanel loginJpanel = new JPanel();
        JLabel userLabel = new JLabel("Login");
        userText = new JTextField(10);
        loginJpanel.add(userLabel);
        loginJpanel.add(userText);

        //panel haslo
        JPanel passJpanel = new JPanel();
        JLabel passLebel = new JLabel("Hasło");
        passText = new JTextField(10);
        passJpanel.add(passLebel);
        passJpanel.add(passText);

        // etykieta informujaca
        JPanel infoPanel = new JPanel();
         infoLabel = new JLabel(" ");
         infoPanel.add(infoLabel);

        // przyciski
            JPanel buttonPanel = new JPanel();
            loginButton = new JButton("Zaloguj");
            loginButton.addActionListener(this);
            registerButton = new JButton("Zarejestruj");
            registerButton.addActionListener(this);
            buttonPanel.add(loginButton);
            buttonPanel.add(registerButton);
        // dodawanie do main
        main.add(loginJpanel);
        main.add(passJpanel);
        main.add(infoPanel);
        main.add(buttonPanel);
        // dodawanie do okna
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        add(main);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source==loginButton)
        {
            System.out.println("button login");
            if (sql.sprawdz(userText.getText(), passText.getText()))
            {
                Apk ap = new Apk();
                dispose();
            }
            else infoLabel.setText("Błedne hasło lub login");

        }
        if (source==registerButton)
        {
            System.out.println("button register");
            dispose();
            Register rr = new Register();


        }

    }
}
